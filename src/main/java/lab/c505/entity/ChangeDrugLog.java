package lab.c505.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 药物更换日志信息表
 * </p>
 *
 * @author TingTing W
 * @since 2019-03-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_change_drug_log")
public class ChangeDrugLog extends Model<ChangeDrugLog> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "change_drug_id", type = IdType.UUID)
    private String changeDrugId;

    private String operateDocId;

    private String followUpId;

    private String preDrugUsage;

    private String aftDrugUsage;

    private LocalDate changeTime;

    private String changeReason;

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


    public static final String CHANGE_DRUG_ID = "change_drug_id";

    public static final String OPERATE_DOC_ID = "operate_doc_id";

    public static final String FOLLOW_UP_ID = "follow_up_id";

    public static final String PRE_DRUG_USAGE = "pre_drug_usage";

    public static final String AFT_DRUG_USAGE = "aft_drug_usage";

    public static final String CHANGE_TIME = "change_time";

    public static final String CHANGE_REASON = "change_reason";

    public static final String CREATE_TIME = "create_time";

    public static final String CREATE_USER = "create_user";

    public static final String MODIFY_TIME = "modify_time";

    public static final String MODIFY_USER = "modify_user";

    public static final String DELETE_FLAG = "delete_flag";

    public static final String VERSION = "version";

    @Override
    protected Serializable pkVal() {
        return this.changeDrugId;
    }

}
