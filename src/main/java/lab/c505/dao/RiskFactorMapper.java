package lab.c505.dao;

import lab.c505.entity.RiskFactor;

public interface RiskFactorMapper {
    int deleteByPrimaryKey(Long rf_id);

    int insert(RiskFactor record);

    int insertSelective(RiskFactor record);

    RiskFactor selectByPrimaryKey(Long rf_id);

    int updateByPrimaryKeySelective(RiskFactor record);

    int updateByPrimaryKey(RiskFactor record);
}