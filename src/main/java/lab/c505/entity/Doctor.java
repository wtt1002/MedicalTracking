package lab.c505.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 医生表
 * </p>
 *
 * @author TingTing W
 * @since 2019-03-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_doctor")
public class Doctor extends Model<Doctor> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "doctor_id", type = IdType.UUID)
    private String doctorId;

    private String doctorName;

    private Integer gender;

    private String doctorMajor;

    private String deptId;

    private String doctorNum;

    private String qcNum;

    private LocalDate qcDate;

    private String opqcNum;

    private LocalDate opqcDate;

    private LocalDateTime createTime;

    private String createUser;

    private LocalDateTime modifyTime;

    private String modifyUser;

    /**
     * 0删除，1有效
     */
    private Integer deleteFlag;

    /**
     * 此字段用于数据修改并发控制
     */
    private Integer version;


    public static final String DOCTOR_ID = "doctor_id";

    public static final String DOCTOR_NAME = "doctor_name";

    public static final String GENDER = "gender";

    public static final String DOCTOR_MAJOR = "doctor_major";

    public static final String DEPT_ID = "dept_id";

    public static final String DOCTOR_NUM = "doctor_num";

    public static final String QC_NUM = "qc_num";

    public static final String QC_DATE = "qc_date";

    public static final String OPQC_NUM = "opqc_num";

    public static final String OPQC_DATE = "opqc_date";

    public static final String CREATE_TIME = "create_time";

    public static final String CREATE_USER = "create_user";

    public static final String MODIFY_TIME = "modify_time";

    public static final String MODIFY_USER = "modify_user";

    public static final String DELETE_FLAG = "delete_flag";

    public static final String VERSION = "version";

    @Override
    protected Serializable pkVal() {
        return this.doctorId;
    }

}
