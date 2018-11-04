package lab.c505.dao;

import lab.c505.entity.PastMedicalHistory;

public interface PastMedicalHistoryMapper {
    int deleteByPrimaryKey(Long pmh_id);

    int insert(PastMedicalHistory record);

    int insertSelective(PastMedicalHistory record);

    PastMedicalHistory selectByPrimaryKey(Long pmh_id);

    int updateByPrimaryKeySelective(PastMedicalHistory record);

    int updateByPrimaryKey(PastMedicalHistory record);
}