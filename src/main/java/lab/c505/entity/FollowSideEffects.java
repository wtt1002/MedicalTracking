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
 * 随访药物不良反应表
 * </p>
 *
 * @author TingTing W
 * @since 2019-02-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_follow_side_effects")
public class FollowSideEffects extends Model<FollowSideEffects> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "side_effects_id", type = IdType.AUTO)
    private Integer sideEffectsId;

    private String stomachStimulation;

    private String hemorrhage;

    private String goHospital;

    private String dyspnea;

    private String followUpId;

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


    public static final String SIDE_EFFECTS_ID = "side_effects_id";

    public static final String STOMACH_STIMULATION = "stomach_stimulation";

    public static final String HEMORRHAGE = "hemorrhage";

    public static final String GO_HOSPITAL = "go_hospital";

    public static final String DYSPNEA = "dyspnea";

    public static final String FOLLOW_UP_ID = "follow_up_id";

    public static final String CREATE_TIME = "create_time";

    public static final String CREATE_USER = "create_user";

    public static final String MODIFY_TIME = "modify_time";

    public static final String MODIFY_USER = "modify_user";

    public static final String DELETE_FLAG = "delete_flag";

    public static final String VERSION = "version";

    @Override
    protected Serializable pkVal() {
        return this.sideEffectsId;
    }

}
