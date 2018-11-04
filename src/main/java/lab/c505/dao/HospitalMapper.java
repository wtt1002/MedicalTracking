package lab.c505.dao;

import lab.c505.entity.Hospital;

public interface HospitalMapper {
    int deleteByPrimaryKey(Long hosp_id);

    int insert(Hospital record);

    int insertSelective(Hospital record);

    Hospital selectByPrimaryKey(Long hosp_id);

    int updateByPrimaryKeySelective(Hospital record);

    int updateByPrimaryKey(Hospital record);
}