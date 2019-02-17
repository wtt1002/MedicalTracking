package lab.c505.dao;

import lab.c505.entity.FollowSideEffects;

public interface FollowSideEffectsMapper {
    int deleteByPrimaryKey(String side_effects_id);

    int insert(FollowSideEffects record);

    int insertSelective(FollowSideEffects record);

    FollowSideEffects selectByPrimaryKey(String side_effects_id);

    int updateByPrimaryKeySelective(FollowSideEffects record);

    int updateByPrimaryKey(FollowSideEffects record);
}