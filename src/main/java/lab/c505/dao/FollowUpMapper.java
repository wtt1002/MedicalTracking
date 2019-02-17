package lab.c505.dao;

import lab.c505.entity.FollowUp;

public interface FollowUpMapper {
    int deleteByPrimaryKey(String follow_up_id);

    int insert(FollowUp record);

    int insertSelective(FollowUp record);

    FollowUp selectByPrimaryKey(String follow_up_id);

    int updateByPrimaryKeySelective(FollowUp record);

    int updateByPrimaryKey(FollowUp record);
}