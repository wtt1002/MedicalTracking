package lab.c505.dao;

import lab.c505.entity.FollowSchedule;

public interface FollowScheduleMapper {
    int deleteByPrimaryKey(Long fs_id);

    int insert(FollowSchedule record);

    int insertSelective(FollowSchedule record);

    FollowSchedule selectByPrimaryKey(Long fs_id);

    int updateByPrimaryKeySelective(FollowSchedule record);

    int updateByPrimaryKey(FollowSchedule record);
}