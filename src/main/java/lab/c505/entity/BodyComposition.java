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
 * 人体成分分析表
 * </p>
 *
 * @author TingTing W
 * @since 2019-02-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_body_composition")
public class BodyComposition extends Model<BodyComposition> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "body_composition_id", type = IdType.AUTO)
    private Integer bodyCompositionId;

    private BigDecimal height;

    private BigDecimal weight;

    private BigDecimal bmi;

    private BigDecimal muscleWeight;

    private BigDecimal fatWeight;

    private BigDecimal bodyFatPercentage;

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


    public static final String BODY_COMPOSITION_ID = "body_composition_id";

    public static final String HEIGHT = "height";

    public static final String WEIGHT = "weight";

    public static final String BMI = "bmi";

    public static final String MUSCLE_WEIGHT = "muscle_weight";

    public static final String FAT_WEIGHT = "fat_weight";

    public static final String BODY_FAT_PERCENTAGE = "body_fat_percentage";

    public static final String MEDICAL_HISTORY_ID = "medical_history_id";

    public static final String CREATE_TIME = "create_time";

    public static final String CREATE_USER = "create_user";

    public static final String MODIFY_TIME = "modify_time";

    public static final String MODIFY_USER = "modify_user";

    public static final String DELETE_FLAG = "delete_flag";

    public static final String VERSION = "version";

    @Override
    protected Serializable pkVal() {
        return this.bodyCompositionId;
    }

}
