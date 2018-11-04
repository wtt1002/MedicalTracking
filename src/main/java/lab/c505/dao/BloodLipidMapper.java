package lab.c505.dao;

import lab.c505.entity.BloodLipid;

public interface BloodLipidMapper {
    int deleteByPrimaryKey(Long bl_id);

    int insert(BloodLipid record);

    int insertSelective(BloodLipid record);

    BloodLipid selectByPrimaryKey(Long bl_id);

    int updateByPrimaryKeySelective(BloodLipid record);

    int updateByPrimaryKey(BloodLipid record);
}