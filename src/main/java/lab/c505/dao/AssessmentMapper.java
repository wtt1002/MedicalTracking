package lab.c505.dao;

import lab.c505.entity.Assessment;

public interface AssessmentMapper {
    int deleteByPrimaryKey(String assessment_id);

    int insert(Assessment record);

    int insertSelective(Assessment record);

    Assessment selectByPrimaryKey(String assessment_id);

    int updateByPrimaryKeySelective(Assessment record);

    int updateByPrimaryKey(Assessment record);
}