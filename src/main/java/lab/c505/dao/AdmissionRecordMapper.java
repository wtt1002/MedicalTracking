package lab.c505.dao;

import java.util.List;
import lab.c505.entity.AdmissionRecord;
import lab.c505.entity.AdmissionRecordExample;
import org.apache.ibatis.annotations.Param;

public interface AdmissionRecordMapper {
    int countByExample(AdmissionRecordExample example);

    int deleteByExample(AdmissionRecordExample example);

    int deleteByPrimaryKey(Long ar_id);

    int insert(AdmissionRecord record);

    int insertSelective(AdmissionRecord record);

    List<AdmissionRecord> selectByExample(AdmissionRecordExample example);

    AdmissionRecord selectByPrimaryKey(Long ar_id);

    int updateByExampleSelective(@Param("record") AdmissionRecord record, @Param("example") AdmissionRecordExample example);

    int updateByExample(@Param("record") AdmissionRecord record, @Param("example") AdmissionRecordExample example);

    int updateByPrimaryKeySelective(AdmissionRecord record);

    int updateByPrimaryKey(AdmissionRecord record);
}