package lab.c505.dao;

import lab.c505.entity.RiskFactors;

public interface RiskFactorsMapper {
    int deleteByPrimaryKey(Long rf_id);

    int insert(RiskFactors record);

    int insertSelective(RiskFactors record);

    RiskFactors selectByPrimaryKey(Long rf_id);

    int updateByPrimaryKeySelective(RiskFactors record);

    int updateByPrimaryKey(RiskFactors record);
}