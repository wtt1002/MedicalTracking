package lab.c505.dao;

import lab.c505.entity.FollowRecord;

public interface FollowRecordMapper {
    int deleteByPrimaryKey(Long fr_id);

    int insert(FollowRecord record);

    int insertSelective(FollowRecord record);

    FollowRecord selectByPrimaryKey(Long fr_id);

    int updateByPrimaryKeySelective(FollowRecord record);

    int updateByPrimaryKey(FollowRecord record);
}