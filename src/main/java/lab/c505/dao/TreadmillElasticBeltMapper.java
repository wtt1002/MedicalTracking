package lab.c505.dao;

import lab.c505.entity.TreadmillElasticBelt;

public interface TreadmillElasticBeltMapper {
    int deleteByPrimaryKey(Long tteb_id);

    int insert(TreadmillElasticBelt record);

    int insertSelective(TreadmillElasticBelt record);

    TreadmillElasticBelt selectByPrimaryKey(Long tteb_id);

    int updateByPrimaryKeySelective(TreadmillElasticBelt record);

    int updateByPrimaryKey(TreadmillElasticBelt record);
}