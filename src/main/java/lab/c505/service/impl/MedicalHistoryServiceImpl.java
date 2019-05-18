package lab.c505.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lab.c505.dto.*;
import lab.c505.entity.*;
import lab.c505.mapper.*;
import lab.c505.service.MedicalHistoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.commons.lang3.ArrayUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;


/**
 * <p>
 * 患者病史表，记录患者每一次入院信息 服务实现类
 * </p>
 *
 * @author TingTing W
 * @since 2019-02-19
 */
@Service
@Primary
public class MedicalHistoryServiceImpl extends ServiceImpl<MedicalHistoryMapper, MedicalHistory> implements MedicalHistoryService {

    @Autowired
    MedicalHistoryMapper medicalHistoryMapper;

    @Autowired
    private ExamValueMapper examValueMapper;

    @Autowired
    private ExamItemMapper examItemMapper;

    @Autowired
    private ExamCategoryMapper examCategoryMapper;

    @Autowired
    private InspectionConclusionMapper inspectionConclusionMapper;

    String[] examType = {"1","2","3","4"};
    String[] admissionType = {"6","7","8"};
    @Override
    public String getLastMainDiagnose(String patientId) {
        QueryWrapper<MedicalHistory> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(MedicalHistory.PATIENT_ID,patientId);
        queryWrapper.orderByDesc(MedicalHistory.IN_TIME);
        List<MedicalHistory> list = medicalHistoryMapper.selectList(queryWrapper);
        if (list != null && list.size() > 0){
            return list.get(0).getMainDiagnose();
        }
        return null;
    }

    @Override
    public IPage<MedicalHistory> getRecordsByPage(Integer page, Integer count, String patientId) {
        QueryWrapper<MedicalHistory> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(MedicalHistory.PATIENT_ID, patientId);
        queryWrapper.orderByDesc(MedicalHistory.IN_TIME);
        return medicalHistoryMapper.selectPage(new Page<>(page, count),queryWrapper);
    }

    @Override
    @Transactional(propagation= Propagation.REQUIRED,rollbackFor=Exception.class)
    public String addMedicalHistory(MedicalHistory medicalHistory) {
        String uuid = UUID.randomUUID().toString();
        medicalHistory.setMedicalHistoryId(uuid);
        medicalHistoryMapper.insert(medicalHistory);
        return uuid;
    }

    @Override
    public MedicalHistory getOneMedicalHistory(String medicalHistoryId) {
        return medicalHistoryMapper.selectById(medicalHistoryId);
    }

    private List<ExamValue> getListExamValue(String medicalHistoryId, int examIndex) throws Exception{
        QueryWrapper<ExamValue> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(ExamValue.MEDICAL_HISTORY_ID, medicalHistoryId)
        .eq(ExamValue.EXAM_INDEX, examIndex);
        return examValueMapper.selectList(queryWrapper);
    }

    private List<ExamItem> getListExamItem(List<ExamValue> listValue) throws Exception{
        List<ExamItem> listItem = new ArrayList<ExamItem>();
        for(ExamValue examValue : listValue){
            listItem.add(examItemMapper.selectById(examValue.getExamItemId()));
        }
        return listItem;
    }


    private HashMap<String, MedicalHistoryExamDto> getMedicalHistory
            (List<ExamValue> listValue, List<ExamItem> listItem) throws Exception{
        HashMap<String, MedicalHistoryExamDto> maps = new HashMap<>();

        for(int i = 0; i < listItem.size(); ++ i){
            ExamItem examItem = listItem.get(i);
            String key = examItem.getExamCategoryId();
            MedicalHistoryExamDto medicalHistoryExamDto = maps.get(key);
            if(medicalHistoryExamDto == null){
                ExamCategory examCategory = examCategoryMapper.selectById(examItem.getExamCategoryId());
                maps.put(key, new MedicalHistoryExamDto(examCategory, examItem,listValue.get(i)));
            }else{
                medicalHistoryExamDto.getListMyExamDto().add(new MyExamDto(examItem, listValue.get(i)));
            }
        }
        return maps;
    }
    @Override
    public List<MedicalHistoryExamDto> queryMedicalHistory(String medicalHistoryId, int examIndex) throws Exception{
        List<ExamValue> listValue = getListExamValue(medicalHistoryId, examIndex);
        List<ExamItem> listItem = getListExamItem(listValue);
        HashMap<String, MedicalHistoryExamDto> maps = getMedicalHistory(listValue, listItem);
        List<MedicalHistoryExamDto> list = new ArrayList<>();
        for(String key : maps.keySet()) {
            if (ArrayUtils.contains(examType, key)) {
                list.add(maps.get(key));
            }
        }
//        for(String key : maps.keySet()){
//            list.add(maps.get(key));
//        }

        return list;
    }

    private ExamItem getItemExamByCode(String code) throws Exception{
        QueryWrapper<ExamItem> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(ExamItem.EXAM_ITEM_CODE, code);
        return examItemMapper.selectOne(queryWrapper);
    }

    @Transactional(propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
    public MyExamDto updateSingleExamValue(AddMedicalExamDto addMedicalExamDto) throws Exception{

        ExamItem examItem = getItemExamByCode(addMedicalExamDto.getExamItemCode());
        if(examItem == null){
            throw new Exception("ExamItem不存在");
        }
        addMedicalExamDto.setExamItemId(examItem.getExamItemId());
        ExamValue examValue = addMedicalExamDto.toExamValue();
        if(examValueMapper.updateById(examValue) == 0){
            throw new Exception("更新 ExamValue 失败");
        }
        return new MyExamDto(examItem, examValue);
    }

    @Override
    public List<MyExamDto> updateMedicalExam(List<AddMedicalExamDto> addMedicalExamDtos) throws Exception {
        List<MyExamDto> list = new ArrayList<>();
        for(AddMedicalExamDto addMedicalExamDto : addMedicalExamDtos){
            list.add(updateSingleExamValue(addMedicalExamDto));
        }
        return list;
    }

    @Transactional(propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
    public MyExamDto insertSingleExamValue(AddMedicalExamDto addMedicalExamDto) throws Exception{

        ExamItem examItem = getItemExamByCode(addMedicalExamDto.getExamItemCode());
        if(examItem == null){
            throw new Exception("ExamItem不存在");
        }
        addMedicalExamDto.setExamItemId(examItem.getExamItemId()).setExamValueId(UUID.randomUUID().toString());
        ExamValue examValue = addMedicalExamDto.toExamValue();
        if(examValueMapper.insert(examValue) == 0){
            throw new Exception("插入 ExamValue 失败");
        }
        return new MyExamDto(examItem, examValue);
    }

    @Override
    @Transactional(propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
    public List<MyExamDto> insertMedicalExam(List<AddMedicalExamDto> addExamDtos) throws Exception {
        List<MyExamDto> list = new ArrayList<>();
        for(AddMedicalExamDto addMedicalExamDto : addExamDtos){
            list.add(insertSingleExamValue(addMedicalExamDto));
        }
        return list;
    }

    /**
     * 查询入院康复检查项目，携带检查结论
     * @param medicalHistoryId
     * @return
     * @throws Exception
     */
    @Override
    public List<MedicalHistoryExamDto> queryMedicalHistoryWithConclusion(String medicalHistoryId ,int examIndex) throws Exception {
        List<ExamValue> listValue = getListExamValue(medicalHistoryId, examIndex);
        List<ExamItem> listItem = getListExamItem(listValue);
        HashMap<String, MedicalHistoryExamDto> maps = getMedicalHistory(listValue, listItem);

        List<MedicalHistoryExamDto> list = new ArrayList<>();
        //查询结论
        for(String key : maps.keySet()){
            if (ArrayUtils.contains(admissionType,key)){
                MedicalHistoryExamDto singleDto = maps.get(key);
                QueryWrapper<InspectionConclusion> queryWrapper = new QueryWrapper<>();
                queryWrapper.eq(InspectionConclusion.MEDICAL_HISTORY_ID,medicalHistoryId)
                        .eq(InspectionConclusion.EXAM_INDEX,examIndex)
                        .eq(InspectionConclusion.EXAM_CATEGORY,singleDto.getExamCategoryCode());
                InspectionConclusion conclusion = inspectionConclusionMapper.selectOne(queryWrapper);
                if(conclusion != null){
                    singleDto.setExamConclusion(conclusion.getExamConclusion());
                }
                list.add(singleDto);
            }
        }
        return list;
    }

    @Transactional(propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
    public InspectionConclusion insertInspection(InspectionConclusion inspectionConclusion) throws Exception {
        inspectionConclusion.setInspectionConclusionId(UUID.randomUUID().toString())
                .setExamTime(LocalDate.now());
        if(inspectionConclusionMapper.insert(inspectionConclusion) == 0){
            throw new Exception("InspectionConclusion 插入失败！");
        }
        return inspectionConclusion;
    }

    @Transactional(propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
    public InspectionConclusion updateInspection(InspectionConclusion inspectionConclusion) throws Exception {
        inspectionConclusion.setExamTime(LocalDate.now());
        if(inspectionConclusionMapper.updateById(inspectionConclusion) == 0){
            throw new Exception("InspectionConclusion 插入失败！");
        }
        return inspectionConclusion;
    }

    @Override
    @Transactional(propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
    public MyExamWithConclusionDto insertExamWithConclusion(AddMedicalExamWithConclusionDto addDto) throws Exception {
        MyExamWithConclusionDto mydto = new MyExamWithConclusionDto();
        mydto.setMyExamDtos(insertMedicalExam(addDto.getAddMedicalExamDtos()));
        mydto.setInspectionConclusion(insertInspection(addDto.getInspectionConclusion()));
        return mydto;
    }

    @Override
    @Transactional(propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
    public MyExamWithConclusionDto updateExamWithConclusion(AddMedicalExamWithConclusionDto addDto) throws Exception {
        MyExamWithConclusionDto mydto = new MyExamWithConclusionDto();
        mydto.setMyExamDtos(updateMedicalExam(addDto.getAddMedicalExamDtos()));
        mydto.setInspectionConclusion(updateInspection(addDto.getInspectionConclusion()));
        return mydto;
    }
}
