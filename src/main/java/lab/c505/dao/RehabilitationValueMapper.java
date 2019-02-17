package lab.c505.dao;

import lab.c505.entity.RehabilitationValue;

public interface RehabilitationValueMapper {
    int deleteByPrimaryKey(String train_value_id);

    int insert(RehabilitationValue record);

    int insertSelective(RehabilitationValue record);

    RehabilitationValue selectByPrimaryKey(String train_value_id);

    int updateByPrimaryKeySelective(RehabilitationValue record);

    int updateByPrimaryKey(RehabilitationValue record);
}