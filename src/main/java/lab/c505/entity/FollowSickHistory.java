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
 * 随访病史表，从出院到此次随访为止，出现的所有病史
 * </p>
 *
 * @author TingTing W
 * @since 2019-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_follow_sick_history")
public class FollowSickHistory extends Model<FollowSickHistory> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "follow_sick_history_id", type = IdType.AUTO)
    private Integer followSickHistoryId;

    private Integer followUpId;

    private String ischemia;

    private String hemorrhage;

    private Integer revascularization;

    private Integer nyhaRank;

    private Integer isWeak;

    private Integer isSoreness;

    private Integer isSmoke;

    private Integer isPatientEdu;

    private String otherInfo;

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


    public static final String FOLLOW_SICK_HISTORY_ID = "follow_sick_history_id";

    public static final String FOLLOW_UP_ID = "follow_up_id";

    public static final String ISCHEMIA = "ischemia";

    public static final String HEMORRHAGE = "hemorrhage";

    public static final String REVASCULARIZATION = "revascularization";

    public static final String NYHA_RANK = "nyha_rank";

    public static final String IS_WEAK = "is_weak";

    public static final String IS_SORENESS = "is_soreness";

    public static final String IS_SMOKE = "is_smoke";

    public static final String IS_PATIENT_EDU = "is_patient_edu";

    public static final String OTHER_INFO = "other_info";

    public static final String CREATE_TIME = "create_time";

    public static final String CREATE_USER = "create_user";

    public static final String MODIFY_TIME = "modify_time";

    public static final String MODIFY_USER = "modify_user";

    public static final String DELETE_FLAG = "delete_flag";

    public static final String VERSION = "version";

    @Override
    protected Serializable pkVal() {
        return this.followSickHistoryId;
    }

}
