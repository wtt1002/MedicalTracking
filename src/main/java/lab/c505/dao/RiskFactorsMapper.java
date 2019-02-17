package lab.c505.dao;

import lab.c505.entity.RiskFactors;

public interface RiskFactorsMapper {
    int deleteByPrimaryKey(String risk_factors_id);

    int insert(RiskFactors record);

    int insertSelective(RiskFactors record);

    RiskFactors selectByPrimaryKey(String risk_factors_id);

    int updateByPrimaryKeySelective(RiskFactors record);

    int updateByPrimaryKey(RiskFactors record);
}