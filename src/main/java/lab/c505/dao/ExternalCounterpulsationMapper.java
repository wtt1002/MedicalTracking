package lab.c505.dao;

import lab.c505.entity.ExternalCounterpulsation;

public interface ExternalCounterpulsationMapper {
    int deleteByPrimaryKey(Long ec_id);

    int insert(ExternalCounterpulsation record);

    int insertSelective(ExternalCounterpulsation record);

    ExternalCounterpulsation selectByPrimaryKey(Long ec_id);

    int updateByPrimaryKeySelective(ExternalCounterpulsation record);

    int updateByPrimaryKey(ExternalCounterpulsation record);
}