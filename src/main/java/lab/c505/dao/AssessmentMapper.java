package lab.c505.dao;

import lab.c505.entity.Assessment;

public interface AssessmentMapper {
    int deleteByPrimaryKey(Long assessment_id);

    int insert(Assessment record);

    int insertSelective(Assessment record);

    Assessment selectByPrimaryKey(Long assessment_id);

    int updateByPrimaryKeySelective(Assessment record);

    int updateByPrimaryKey(Assessment record);
}