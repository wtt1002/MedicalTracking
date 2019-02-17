package lab.c505.dao;

import lab.c505.entity.RehabilitationTrainCategory;

public interface RehabilitationTrainCategoryMapper {
    int deleteByPrimaryKey(String rehabilitation_train_category_id);

    int insert(RehabilitationTrainCategory record);

    int insertSelective(RehabilitationTrainCategory record);

    RehabilitationTrainCategory selectByPrimaryKey(String rehabilitation_train_category_id);

    int updateByPrimaryKeySelective(RehabilitationTrainCategory record);

    int updateByPrimaryKey(RehabilitationTrainCategory record);
}