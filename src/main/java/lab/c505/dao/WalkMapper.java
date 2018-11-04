package lab.c505.dao;

import lab.c505.entity.Walk;

public interface WalkMapper {
    int deleteByPrimaryKey(Long wt_id);

    int insert(Walk record);

    int insertSelective(Walk record);

    Walk selectByPrimaryKey(Long wt_id);

    int updateByPrimaryKeySelective(Walk record);

    int updateByPrimaryKey(Walk record);
}