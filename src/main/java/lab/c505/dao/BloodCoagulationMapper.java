package lab.c505.dao;

import lab.c505.entity.BloodCoagulation;

public interface BloodCoagulationMapper {
    int deleteByPrimaryKey(Long bc_id);

    int insert(BloodCoagulation record);

    int insertSelective(BloodCoagulation record);

    BloodCoagulation selectByPrimaryKey(Long bc_id);

    int updateByPrimaryKeySelective(BloodCoagulation record);

    int updateByPrimaryKey(BloodCoagulation record);
}