package lab.c505.dao;

import lab.c505.entity.DrugCategory;

public interface DrugCategoryMapper {
    int deleteByPrimaryKey(String drug_category_id);

    int insert(DrugCategory record);

    int insertSelective(DrugCategory record);

    DrugCategory selectByPrimaryKey(String drug_category_id);

    int updateByPrimaryKeySelective(DrugCategory record);

    int updateByPrimaryKey(DrugCategory record);
}