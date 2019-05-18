package lab.c505.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lab.c505.dto.DrugAndUseageDto;
import lab.c505.dto.QueryDrugDto;
import lab.c505.entity.Drug;
import lab.c505.entity.DrugCategory;
import lab.c505.entity.ExamValue;
import lab.c505.entity.FollowDrugUsage;
import lab.c505.mapper.DrugCategoryMapper;
import lab.c505.mapper.DrugMapper;
import lab.c505.mapper.FollowDrugUsageMapper;
import lab.c505.service.DrugService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

/**
 * <p>
 * 药物表 服务实现类
 * </p>
 *
 * @author TingTing W
 * @since 2019-02-19
 */
@Service
public class DrugServiceImpl extends ServiceImpl<DrugMapper, Drug> implements DrugService {

    @Autowired
    private FollowDrugUsageMapper followDrugUsageMapper;

    @Autowired
    private DrugMapper drugMapper;

    @Autowired
    private DrugCategoryMapper drugCategoryMapper;

    private List<FollowDrugUsage> getListFollowDrug(String medicalHistoryId, int followUpIndex) throws Exception{
        QueryWrapper<FollowDrugUsage> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(FollowDrugUsage.MEDICAL_HISTORY_ID, medicalHistoryId)
        .eq(FollowDrugUsage.FOLLOW_UP_INDEX, followUpIndex);
        return followDrugUsageMapper.selectList(queryWrapper);
    }

    private DrugAndUseageDto getDrugUseageDot(FollowDrugUsage followDrugUsage) throws Exception{
        if(followDrugUsage == null){
            throw new Exception("FollowDrugUsage is null");
        }
        Drug drug = drugMapper.selectById(followDrugUsage.getDrugId());
        return new DrugAndUseageDto(drug, followDrugUsage);
    }
    @Override
    public List<QueryDrugDto> queryDrugList(String medicalHistoryId, int followUpIndex) throws Exception {
        HashMap<String, QueryDrugDto> maps = new HashMap<>();
        List<FollowDrugUsage> list = getListFollowDrug(medicalHistoryId, followUpIndex);
        for(FollowDrugUsage followDrugUsage : list){
            DrugAndUseageDto drugAndUseageDto = getDrugUseageDot(followDrugUsage);
            String drugCategoryId = drugAndUseageDto.getDrug().getDrugCategoryId();
            QueryDrugDto queryDrugDto = maps.get(drugCategoryId);
            if(queryDrugDto != null){
                queryDrugDto.getDrugAndUseageDtoList().add(drugAndUseageDto);
            }else{
                DrugCategory drugCategory = drugCategoryMapper.selectById(drugCategoryId);
                maps.put(drugCategoryId, new QueryDrugDto(drugCategory, drugAndUseageDto));
            }
        }
        return new ArrayList<>(maps.values());
    }

    @Transactional(propagation= Propagation.REQUIRED,rollbackFor=Exception.class)
    public void addDrug(Drug drug) throws Exception{
        if(drugMapper.insert(drug) == 0){
            throw new Exception("Insert Drug failed");
        }
    }

    @Transactional(propagation= Propagation.REQUIRED,rollbackFor=Exception.class)
    public void addDrugUsage(FollowDrugUsage followDrugUsage) throws Exception{
        if(followDrugUsageMapper.insert(followDrugUsage) == 0){
            throw new Exception("Insert FollowDrugUsage failed");
        }
    }

    private DrugCategory getDrugCategoryByCode(String code) throws Exception{
        QueryWrapper<DrugCategory> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(DrugCategory.DRUG_CATEGORY_CODE, code);
        return drugCategoryMapper.selectOne(queryWrapper);
    }
    public Drug getDrug(String code) throws Exception{
        QueryWrapper<Drug> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(Drug.DRUG_CODE, code);
        return drugMapper.selectOne(queryWrapper);
    }
    @Override
    @Transactional(propagation= Propagation.REQUIRED,rollbackFor=Exception.class)
    public List<QueryDrugDto> insertDrugList(List<QueryDrugDto> queryDrugDtoList) throws Exception {
        for(QueryDrugDto queryDrugDto : queryDrugDtoList){
            DrugCategory drugCategory = getDrugCategoryByCode(queryDrugDto.getDrugCategoryCode());
            for(DrugAndUseageDto drugAndUseageDto : queryDrugDto.getDrugAndUseageDtoList()){
                String drugId = getDrug(drugAndUseageDto.getDrug().getDrugCode()).getDrugId();
//                addDrug(drugAndUseageDto.getDrug().setDrugId(drugId)
//                        .setDrugCategoryId(drugCategory.getDrugCategoryId()));
                addDrugUsage(drugAndUseageDto.getFollowDrugUsage()
                        .setDrugId(drugId).setDrugUsageId(UUID.randomUUID().toString()));
            }
            queryDrugDto.setDrugCategoryName(drugCategory.getDrugCategoryName());
        }
        return queryDrugDtoList;
    }

    @Override
    @Transactional(propagation= Propagation.REQUIRED,rollbackFor=Exception.class)
    public DrugAndUseageDto updateDrug(DrugAndUseageDto drugAndUseageDto) throws Exception {
//        if(drugMapper.updateById(drugAndUseageDto.getDrug()) == 0){
//            throw new Exception("update Drug failed");
//        }
        String drugId = getDrug(drugAndUseageDto.getDrug().getDrugCode()).getDrugId();
        if(followDrugUsageMapper.updateById(drugAndUseageDto.getFollowDrugUsage().setDrugId(drugId)) == 0){
            throw new Exception("update DrugUsage failed");
        }
        return drugAndUseageDto;
    }

    @Override
    @Transactional(propagation= Propagation.REQUIRED,rollbackFor=Exception.class)
    public void deleteDrug(FollowDrugUsage followDrugUsage) throws Exception {
        if(followDrugUsageMapper.deleteById(followDrugUsage.getDrugUsageId()) == 0){
            throw new Exception("delete Drug failed");
        }
//        if(drugMapper.deleteById(followDrugUsage.getDrugId()) == 0){
//            throw new Exception("delete Drug failed");
//        }

    }
}
