package lab.c505.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lab.c505.entity.AccountPatient;
import lab.c505.entity.Patient;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AccountPatientMapper extends BaseMapper<AccountPatient> {
    /**
     *
     * @param accountId
     * @param page
     * @return
     */
    @Select("<script>" +
            "SELECT t_patient.* FROM t_account_patient, t_patient " +
            "WHERE t_account_patient.account_id = #{account_id} and t_patient.delete_flag != 1 " +
            "and t_account_patient.patient_id = t_patient.patient_id " +
            "<if test='filter!=null'>" +
            "and name like CONCAT('%',#{filter},'%')" +
            "</if>" +
            " ORDER BY patient_id</script>")
    List<Patient> getPatientByAccountId(Page page, @Param("account_id") String accountId, @Param("filter") String filter);
}
