package lab.c505.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lab.c505.dto.AddMedicalExamDto;
import lab.c505.dto.MedicalHistoryDto;
import lab.c505.dto.MedicalHistoryExamDto;
import lab.c505.dto.MyExamDto;
import lab.c505.entity.ExamCategory;
import lab.c505.entity.ExamItem;
import lab.c505.entity.ExamValue;
import lab.c505.entity.MedicalHistory;
import lab.c505.mapper.ExamCategoryMapper;
import lab.c505.mapper.ExamItemMapper;
import lab.c505.mapper.ExamValueMapper;
import lab.c505.mapper.MedicalHistoryMapper;
import lab.c505.service.MedicalHistoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

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

    private List<ExamValue> getListExamValue(String medicalHistoryId) throws Exception{
        QueryWrapper<ExamValue> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(ExamValue.MEDICAL_HISTORY_ID, medicalHistoryId);
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
    public List<MedicalHistoryExamDto> queryMedicalHistory(String medicalHistoryId) throws Exception{
        List<ExamValue> listValue = getListExamValue(medicalHistoryId);
        List<ExamItem> listItem = getListExamItem(listValue);
        HashMap<String, MedicalHistoryExamDto> maps = getMedicalHistory(listValue, listItem);
        List<MedicalHistoryExamDto> list = new ArrayList<>();
        for(String key : maps.keySet()){
            list.add(maps.get(key));
        }
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
        addMedicalExamDto.setExamItemId(examItem.getExamItemId()).setExamValueId(null);
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
}
