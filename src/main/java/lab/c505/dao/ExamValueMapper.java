package lab.c505.dao;

import lab.c505.entity.ExamValue;

public interface ExamValueMapper {
    int deleteByPrimaryKey(String exam_value_id);

    int insert(ExamValue record);

    int insertSelective(ExamValue record);

    ExamValue selectByPrimaryKey(String exam_value_id);

    int updateByPrimaryKeySelective(ExamValue record);

    int updateByPrimaryKey(ExamValue record);
}