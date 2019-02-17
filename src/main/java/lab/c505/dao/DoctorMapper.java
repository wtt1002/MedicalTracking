package lab.c505.dao;

import lab.c505.entity.Doctor;

public interface DoctorMapper {
    int deleteByPrimaryKey(String doctor_id);

    int insert(Doctor record);

    int insertSelective(Doctor record);

    Doctor selectByPrimaryKey(String doctor_id);

    int updateByPrimaryKeySelective(Doctor record);

    int updateByPrimaryKey(Doctor record);
}