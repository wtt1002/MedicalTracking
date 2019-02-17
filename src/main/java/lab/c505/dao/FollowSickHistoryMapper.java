package lab.c505.dao;

import lab.c505.entity.FollowSickHistory;

public interface FollowSickHistoryMapper {
    int deleteByPrimaryKey(String follow_sick_history_id);

    int insert(FollowSickHistory record);

    int insertSelective(FollowSickHistory record);

    FollowSickHistory selectByPrimaryKey(String follow_sick_history_id);

    int updateByPrimaryKeySelective(FollowSickHistory record);

    int updateByPrimaryKey(FollowSickHistory record);
}