package lab.c505.dao;

import lab.c505.entity.FollowDrugUsage;

public interface FollowDrugUsageMapper {
    int deleteByPrimaryKey(String drug_usage_id);

    int insert(FollowDrugUsage record);

    int insertSelective(FollowDrugUsage record);

    FollowDrugUsage selectByPrimaryKey(String drug_usage_id);

    int updateByPrimaryKeySelective(FollowDrugUsage record);

    int updateByPrimaryKey(FollowDrugUsage record);
}