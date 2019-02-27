package lab.c505.entity;

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
 * 随访表，记录随访的计划与实际时间，随访患者与医生等信息
 * </p>
 *
 * @author TingTing W
 * @since 2019-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_follow_up")
public class FollowUp extends Model<FollowUp> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "follow_up_id", type = IdType.AUTO)
    private Integer followUpId;

    private Integer medicalHistoryId;

    private Integer doctorId;

    private LocalDateTime planTime;

    private LocalDateTime finalTime;

    private LocalDateTime planWay;

    private LocalDateTime finalWay;

    private Integer followUpDuration;

    private String recoveryStatus;

    private String furtherConsultation;

    private String recentSymptoms;

    private Integer followUpIndex;

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


    public static final String FOLLOW_UP_ID = "follow_up_id";

    public static final String MEDICAL_HISTORY_ID = "medical_history_id";

    public static final String DOCTOR_ID = "doctor_id";

    public static final String PLAN_TIME = "plan_time";

    public static final String FINAL_TIME = "final_time";

    public static final String PLAN_WAY = "plan_way";

    public static final String FINAL_WAY = "final_way";

    public static final String FOLLOW_UP_DURATION = "follow_up_duration";

    public static final String RECOVERY_STATUS = "recovery_status";

    public static final String FURTHER_CONSULTATION = "further_consultation";

    public static final String RECENT_SYMPTOMS = "recent_symptoms";

    public static final String FOLLOW_UP_INDEX = "follow_up_index";

    public static final String CREATE_TIME = "create_time";

    public static final String CREATE_USER = "create_user";

    public static final String MODIFY_TIME = "modify_time";

    public static final String MODIFY_USER = "modify_user";

    public static final String DELETE_FLAG = "delete_flag";

    public static final String VERSION = "version";

    @Override
    protected Serializable pkVal() {
        return this.followUpId;
    }

}
