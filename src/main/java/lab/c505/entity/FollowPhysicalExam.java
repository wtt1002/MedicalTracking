package lab.c505.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 随访体检表
 * </p>
 *
 * @author TingTing W
 * @since 2019-03-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_follow_physical_exam")
public class FollowPhysicalExam extends Model<FollowPhysicalExam> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "follow_physical_exam_id", type = IdType.UUID)
    private String followPhysicalExamId;

    private String followUpId;

    private BigDecimal bloodPressureHigh;

    private BigDecimal bloodPressureLow;

    private BigDecimal heartRate;

    private BigDecimal weight;

    private String otherInfo;


    public static final String FOLLOW_PHYSICAL_EXAM_ID = "follow_physical_exam_id";

    public static final String FOLLOW_UP_ID = "follow_up_id";

    public static final String BLOOD_PRESSURE_HIGH = "blood_pressure_high";

    public static final String BLOOD_PRESSURE_LOW = "blood_pressure_low";

    public static final String HEART_RATE = "heart_rate";

    public static final String WEIGHT = "weight";

    public static final String OTHER_INFO = "other_info";

    @Override
    protected Serializable pkVal() {
        return this.followPhysicalExamId;
    }

}
