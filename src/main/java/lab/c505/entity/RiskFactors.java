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
 * 个体化危险因素控制表
 * </p>
 *
 * @author TingTing W
 * @since 2019-02-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_risk_factors")
public class RiskFactors extends Model<RiskFactors> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "risk_factors_id", type = IdType.AUTO)
    private Integer riskFactorsId;

    private Integer isSmoke;

    private Integer isHeavy;

    private Integer isLessMove;

    private Integer bloodPressureControl;

    private Integer glycemicControl;

    private Integer bloodLipidControl;

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


    public static final String RISK_FACTORS_ID = "risk_factors_id";

    public static final String IS_SMOKE = "is_smoke";

    public static final String IS_HEAVY = "is_heavy";

    public static final String IS_LESS_MOVE = "is_less_move";

    public static final String BLOOD_PRESSURE_CONTROL = "blood_pressure_control";

    public static final String GLYCEMIC_CONTROL = "glycemic_control";

    public static final String BLOOD_LIPID_CONTROL = "blood_lipid_control";

    public static final String FOLLOW_UP_ID = "follow_up_id";

    public static final String CREATE_TIME = "create_time";

    public static final String CREATE_USER = "create_user";

    public static final String MODIFY_TIME = "modify_time";

    public static final String MODIFY_USER = "modify_user";

    public static final String DELETE_FLAG = "delete_flag";

    public static final String VERSION = "version";

    @Override
    protected Serializable pkVal() {
        return this.riskFactorsId;
    }

}
