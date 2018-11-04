package lab.c505.dao;

import lab.c505.entity.OtherExam;

public interface OtherExamMapper {
    int deleteByPrimaryKey(Long oe_id);

    int insert(OtherExam record);

    int insertSelective(OtherExam record);

    OtherExam selectByPrimaryKey(Long oe_id);

    int updateByPrimaryKeySelective(OtherExam record);

    int updateByPrimaryKey(OtherExam record);
}