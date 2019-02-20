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
 * 患者评分表
 * </p>
 *
 * @author TingTing W
 * @since 2019-02-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_score")
public class Score extends Model<Score> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "score_id", type = IdType.AUTO)
    private Integer scoreId;

    private String medicalHistoryId;

    private BigDecimal graceScore;

    private BigDecimal daptScore;

    private BigDecimal crucedeScore;

    private String daptDetail;

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


    public static final String SCORE_ID = "score_id";

    public static final String MEDICAL_HISTORY_ID = "medical_history_id";

    public static final String GRACE_SCORE = "grace_score";

    public static final String DAPT_SCORE = "dapt_score";

    public static final String CRUCEDE_SCORE = "crucede_score";

    public static final String DAPT_DETAIL = "dapt_detail";

    public static final String CREATE_TIME = "create_time";

    public static final String CREATE_USER = "create_user";

    public static final String MODIFY_TIME = "modify_time";

    public static final String MODIFY_USER = "modify_user";

    public static final String DELETE_FLAG = "delete_flag";

    public static final String VERSION = "version";

    @Override
    protected Serializable pkVal() {
        return this.scoreId;
    }

}
