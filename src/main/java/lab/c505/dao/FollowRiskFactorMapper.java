package lab.c505.dao;

import lab.c505.entity.FollowRiskFactor;

public interface FollowRiskFactorMapper {
    int deleteByPrimaryKey(Long frf_id);

    int insert(FollowRiskFactor record);

    int insertSelective(FollowRiskFactor record);

    FollowRiskFactor selectByPrimaryKey(Long frf_id);

    int updateByPrimaryKeySelective(FollowRiskFactor record);

    int updateByPrimaryKey(FollowRiskFactor record);
}