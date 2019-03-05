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
 * 
 * </p>
 *
 * @author TingTing W
 * @since 2019-03-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_vascular_access_problem")
public class VascularAccessProblem extends Model<VascularAccessProblem> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "vascular_access_problem_id", type = IdType.AUTO)
    private Integer vascularAccessProblemId;

    private Integer medicalHistoryId;

    private String complication;

    private String otherComplication;

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


    public static final String VASCULAR_ACCESS_PROBLEM_ID = "vascular_access_problem_id";

    public static final String MEDICAL_HISTORY_ID = "medical_history_id";

    public static final String COMPLICATION = "complication";

    public static final String OTHER_COMPLICATION = "other_complication";

    public static final String CREATE_TIME = "create_time";

    public static final String CREATE_USER = "create_user";

    public static final String MODIFY_TIME = "modify_time";

    public static final String MODIFY_USER = "modify_user";

    public static final String DELETE_FLAG = "delete_flag";

    public static final String VERSION = "version";

    @Override
    protected Serializable pkVal() {
        return this.vascularAccessProblemId;
    }

}
