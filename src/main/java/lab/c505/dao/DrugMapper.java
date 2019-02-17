package lab.c505.dao;

import lab.c505.entity.Drug;

public interface DrugMapper {
    int deleteByPrimaryKey(String drug_id);

    int insert(Drug record);

    int insertSelective(Drug record);

    Drug selectByPrimaryKey(String drug_id);

    int updateByPrimaryKeySelective(Drug record);

    int updateByPrimaryKey(Drug record);
}