package lab.c505.dao;

import lab.c505.entity.AdmissionRecord;

public interface AdmissionRecordMapper {
    int deleteByPrimaryKey(Long ar_id);

    int insert(AdmissionRecord record);

    int insertSelective(AdmissionRecord record);

    AdmissionRecord selectByPrimaryKey(Long ar_id);

    int updateByPrimaryKeySelective(AdmissionRecord record);

    int updateByPrimaryKey(AdmissionRecord record);
}