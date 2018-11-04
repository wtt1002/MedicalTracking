package lab.c505.dao;

import lab.c505.entity.Doctor;

public interface DoctorMapper {
    int deleteByPrimaryKey(Long doctor_id);

    int insert(Doctor record);

    int insertSelective(Doctor record);

    Doctor selectByPrimaryKey(Long doctor_id);

    int updateByPrimaryKeySelective(Doctor record);

    int updateByPrimaryKey(Doctor record);
}