package lab.c505.dao;

import lab.c505.entity.MedicalHistory;

public interface MedicalHistoryMapper {
    int deleteByPrimaryKey(String medical_history_id);

    int insert(MedicalHistory record);

    int insertSelective(MedicalHistory record);

    MedicalHistory selectByPrimaryKey(String medical_history_id);

    int updateByPrimaryKeySelective(MedicalHistory record);

    int updateByPrimaryKey(MedicalHistory record);
}