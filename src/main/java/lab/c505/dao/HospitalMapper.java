package lab.c505.dao;

import java.util.List;
import lab.c505.entity.Hospital;
import lab.c505.entity.HospitalExample;
import org.apache.ibatis.annotations.Param;

public interface HospitalMapper {
    int countByExample(HospitalExample example);

    int deleteByExample(HospitalExample example);

    int deleteByPrimaryKey(Long hosp_id);

    int insert(Hospital record);

    int insertSelective(Hospital record);

    List<Hospital> selectByExample(HospitalExample example);

    Hospital selectByPrimaryKey(Long hosp_id);

    int updateByExampleSelective(@Param("record") Hospital record, @Param("example") HospitalExample example);

    int updateByExample(@Param("record") Hospital record, @Param("example") HospitalExample example);

    int updateByPrimaryKeySelective(Hospital record);

    int updateByPrimaryKey(Hospital record);
}