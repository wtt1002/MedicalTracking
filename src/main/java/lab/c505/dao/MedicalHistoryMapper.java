package lab.c505.dao;

import lab.c505.entity.MedicalHistory;

public interface MedicalHistoryMapper {
    int deleteByPrimaryKey(Long mh_id);

    int insert(MedicalHistory record);

    int insertSelective(MedicalHistory record);

    MedicalHistory selectByPrimaryKey(Long mh_id);

    int updateByPrimaryKeySelective(MedicalHistory record);

    int updateByPrimaryKey(MedicalHistory record);
}