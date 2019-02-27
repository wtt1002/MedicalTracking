package lab.c505.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 患者病史表，记录患者每一次入院信息
 * </p>
 *
 * @author TingTing W
 * @since 2019-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_medical_history")
public class MedicalHistory extends Model<MedicalHistory> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "medical_history_id", type = IdType.AUTO)
    private Integer medicalHistoryId;

    private Integer patientId;

    private String admissionNum;

    private LocalDateTime inTime;

    private LocalDateTime outTime;

    private String operateDoc;

    private String mainDiagnose;

    private String riskFactor;

    private String preDrugs;

    private Integer bloodPressureH;

    private Integer bloodPressureL;

    private Integer heartRate;

    private BigDecimal height;

    private BigDecimal weight;

    private BigDecimal bmi;

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


    public static final String MEDICAL_HISTORY_ID = "medical_history_id";

    public static final String PATIENT_ID = "patient_id";

    public static final String ADMISSION_NUM = "admission_num";

    public static final String IN_TIME = "in_time";

    public static final String OUT_TIME = "out_time";

    public static final String OPERATE_DOC = "operate_doc";

    public static final String MAIN_DIAGNOSE = "main_diagnose";

    public static final String RISK_FACTOR = "risk_factor";

    public static final String PRE_DRUGS = "pre_drugs";

    public static final String BLOOD_PRESSURE_H = "blood_pressure_h";

    public static final String BLOOD_PRESSURE_L = "blood_pressure_l";

    public static final String HEART_RATE = "heart_rate";

    public static final String HEIGHT = "height";

    public static final String WEIGHT = "weight";

    public static final String BMI = "bmi";

    public static final String CREATE_TIME = "create_time";

    public static final String CREATE_USER = "create_user";

    public static final String MODIFY_TIME = "modify_time";

    public static final String MODIFY_USER = "modify_user";

    public static final String DELETE_FLAG = "delete_flag";

    public static final String VERSION = "version";

    @Override
    protected Serializable pkVal() {
        return this.medicalHistoryId;
    }

}
