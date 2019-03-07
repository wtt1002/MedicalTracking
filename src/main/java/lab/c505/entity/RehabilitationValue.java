package lab.c505.entity;

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
 * 康复训练值表
 * </p>
 *
 * @author TingTing W
 * @since 2019-03-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_rehabilitation_value")
public class RehabilitationValue extends Model<RehabilitationValue> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "train_value_id", type = IdType.UUID)
    private String trainValueId;

    private String rehabilitationItemId;

    private String medicalHistoryId;

    private Integer trainValue;

    private Integer trainPeriod;

    private Integer trainIntensity;

    private Integer trainTime;

    private Integer trainGroup;

    private Integer trainDuration;

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


    public static final String TRAIN_VALUE_ID = "train_value_id";

    public static final String REHABILITATION_ITEM_ID = "rehabilitation_item_id";

    public static final String MEDICAL_HISTORY_ID = "medical_history_id";

    public static final String TRAIN_VALUE = "train_value";

    public static final String TRAIN_PERIOD = "train_period";

    public static final String TRAIN_INTENSITY = "train_intensity";

    public static final String TRAIN_TIME = "train_time";

    public static final String TRAIN_GROUP = "train_group";

    public static final String TRAIN_DURATION = "train_duration";

    public static final String OTHER_INFO = "other_info";

    public static final String CREATE_TIME = "create_time";

    public static final String CREATE_USER = "create_user";

    public static final String MODIFY_TIME = "modify_time";

    public static final String MODIFY_USER = "modify_user";

    public static final String DELETE_FLAG = "delete_flag";

    public static final String VERSION = "version";

    @Override
    protected Serializable pkVal() {
        return this.trainValueId;
    }

}
