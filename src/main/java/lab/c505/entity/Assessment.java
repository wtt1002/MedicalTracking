package lab.c505.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 入院评估表
 * </p>
 *
 * @author TingTing W
 * @since 2019-03-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_assessment")
public class Assessment extends Model<Assessment> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "assessment_id", type = IdType.UUID)
    private String assessmentId;

    private BigDecimal sasScore;

    private BigDecimal sdsScore;

    private BigDecimal naScore;

    private BigDecimal psqiScore;

    private BigDecimal ipqaScore;

    private BigDecimal fagerstormScore;

    private BigDecimal leftGrip;

    private BigDecimal rightGrip;

    private BigDecimal threeMeterTest;

    private BigDecimal fourMeterTest;

    private BigDecimal standUpTest;

    private BigDecimal leftBalanceTest;

    private BigDecimal rightBalanceTest;

    private BigDecimal sitReach;

    private BigDecimal upperarmCircumference;

    private BigDecimal bmi;

    private BigDecimal tricepsSkinfoldThickness;

    private String medicalHistoryId;

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


    public static final String ASSESSMENT_ID = "assessment_id";

    public static final String SAS_SCORE = "sas_score";

    public static final String SDS_SCORE = "sds_score";

    public static final String NA_SCORE = "na_score";

    public static final String PSQI_SCORE = "psqi_score";

    public static final String IPQA_SCORE = "ipqa_score";

    public static final String FAGERSTORM_SCORE = "fagerstorm_score";

    public static final String LEFT_GRIP = "left_grip";

    public static final String RIGHT_GRIP = "right_grip";

    public static final String THREE_METER_TEST = "three_meter_test";

    public static final String FOUR_METER_TEST = "four_meter_test";

    public static final String STAND_UP_TEST = "stand_up_test";

    public static final String LEFT_BALANCE_TEST = "left_balance_test";

    public static final String RIGHT_BALANCE_TEST = "right_balance_test";

    public static final String SIT_REACH = "sit_reach";

    public static final String UPPERARM_CIRCUMFERENCE = "upperarm_circumference";

    public static final String BMI = "bmi";

    public static final String TRICEPS_SKINFOLD_THICKNESS = "triceps_skinfold_thickness";

    public static final String MEDICAL_HISTORY_ID = "medical_history_id";

    public static final String CREATE_TIME = "create_time";

    public static final String CREATE_USER = "create_user";

    public static final String MODIFY_TIME = "modify_time";

    public static final String MODIFY_USER = "modify_user";

    public static final String DELETE_FLAG = "delete_flag";

    public static final String VERSION = "version";

    @Override
    protected Serializable pkVal() {
        return this.assessmentId;
    }

}
