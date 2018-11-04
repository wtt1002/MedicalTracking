package lab.c505.dao;

import lab.c505.entity.DumbbellElasticBelt;

public interface DumbbellElasticBeltMapper {
    int deleteByPrimaryKey(Long tdeb_id);

    int insert(DumbbellElasticBelt record);

    int insertSelective(DumbbellElasticBelt record);

    DumbbellElasticBelt selectByPrimaryKey(Long tdeb_id);

    int updateByPrimaryKeySelective(DumbbellElasticBelt record);

    int updateByPrimaryKey(DumbbellElasticBelt record);
}