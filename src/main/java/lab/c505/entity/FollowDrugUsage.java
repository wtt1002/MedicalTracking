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
 * 药物用法用量表，两个类型合并
 * </p>
 *
 * @author TingTing W
 * @since 2019-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_follow_drug_usage")
public class FollowDrugUsage extends Model<FollowDrugUsage> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "drug_usage_id", type = IdType.AUTO)
    private Integer drugUsageId;

    private BigDecimal drugDosage;

    private String drugDosageUnit;

    private Integer drugTime;

    private Integer drugDay;

    private Integer drugPeriod;

    private String drugPeriodUnit;

    private Integer drugId;

    private Integer medicalHistoryId;

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

    private Integer followUpIndex;


    public static final String DRUG_USAGE_ID = "drug_usage_id";

    public static final String DRUG_DOSAGE = "drug_dosage";

    public static final String DRUG_DOSAGE_UNIT = "drug_dosage_unit";

    public static final String DRUG_TIME = "drug_time";

    public static final String DRUG_DAY = "drug_day";

    public static final String DRUG_PERIOD = "drug_period";

    public static final String DRUG_PERIOD_UNIT = "drug_period_unit";

    public static final String DRUG_ID = "drug_id";

    public static final String MEDICAL_HISTORY_ID = "medical_history_id";

    public static final String CREATE_TIME = "create_time";

    public static final String CREATE_USER = "create_user";

    public static final String MODIFY_TIME = "modify_time";

    public static final String MODIFY_USER = "modify_user";

    public static final String DELETE_FLAG = "delete_flag";

    public static final String VERSION = "version";

    public static final String FOLLOW_UP_INDEX = "follow_up_index";

    @Override
    protected Serializable pkVal() {
        return this.drugUsageId;
    }

}
