package lab.c505.dao;

import lab.c505.entity.FollowPhysicalExam;

public interface FollowPhysicalExamMapper {
    int deleteByPrimaryKey(String follow_physical_exam_id);

    int insert(FollowPhysicalExam record);

    int insertSelective(FollowPhysicalExam record);

    FollowPhysicalExam selectByPrimaryKey(String follow_physical_exam_id);

    int updateByPrimaryKeySelective(FollowPhysicalExam record);

    int updateByPrimaryKey(FollowPhysicalExam record);
}