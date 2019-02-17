package lab.c505.dao;

import lab.c505.entity.Patient;

public interface PatientMapper {
    int deleteByPrimaryKey(String patient_id);

    int insert(Patient record);

    int insertSelective(Patient record);

    Patient selectByPrimaryKey(String patient_id);

    int updateByPrimaryKeySelective(Patient record);

    int updateByPrimaryKey(Patient record);
}