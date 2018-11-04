package lab.c505.dao;

import lab.c505.entity.PhysicalExam;

public interface PhysicalExamMapper {
    int deleteByPrimaryKey(Long pe_id);

    int insert(PhysicalExam record);

    int insertSelective(PhysicalExam record);

    PhysicalExam selectByPrimaryKey(Long pe_id);

    int updateByPrimaryKeySelective(PhysicalExam record);

    int updateByPrimaryKey(PhysicalExam record);
}