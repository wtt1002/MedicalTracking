package lab.c505.dao;

import lab.c505.entity.ChangeDrugLog;

public interface ChangeDrugLogMapper {
    int deleteByPrimaryKey(String change_drug_id);

    int insert(ChangeDrugLog record);

    int insertSelective(ChangeDrugLog record);

    ChangeDrugLog selectByPrimaryKey(String change_drug_id);

    int updateByPrimaryKeySelective(ChangeDrugLog record);

    int updateByPrimaryKey(ChangeDrugLog record);
}