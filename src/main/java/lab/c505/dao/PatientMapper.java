package lab.c505.dao;

import java.util.List;
import lab.c505.entity.Patient;
import lab.c505.entity.PatientExample;
import org.apache.ibatis.annotations.Param;

public interface PatientMapper {
    int countByExample(PatientExample example);

    int deleteByExample(PatientExample example);

    int deleteByPrimaryKey(Long patient_id);

    int insert(Patient record);

    int insertSelective(Patient record);

    List<Patient> selectByExample(PatientExample example);

    Patient selectByPrimaryKey(Long patient_id);

    int updateByExampleSelective(@Param("record") Patient record, @Param("example") PatientExample example);

    int updateByExample(@Param("record") Patient record, @Param("example") PatientExample example);

    int updateByPrimaryKeySelective(Patient record);

    int updateByPrimaryKey(Patient record);
}