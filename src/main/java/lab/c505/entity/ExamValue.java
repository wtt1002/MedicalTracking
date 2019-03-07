package lab.c505.entity;

import java.math.BigDecimal;
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
 * 
 * </p>
 *
 * @author TingTing W
 * @since 2019-03-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_exam_value")
public class ExamValue extends Model<ExamValue> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "exam_value_id", type = IdType.UUID)
    private String examValueId;

    private String examItemId;

    private String medicalHistoryId;

    private BigDecimal examValue;

    private LocalDate examTime;

    private Integer examIndex;

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


    public static final String EXAM_VALUE_ID = "exam_value_id";

    public static final String EXAM_ITEM_ID = "exam_item_id";

    public static final String MEDICAL_HISTORY_ID = "medical_history_id";

    public static final String EXAM_VALUE = "exam_value";

    public static final String EXAM_TIME = "exam_time";

    public static final String EXAM_INDEX = "exam_index";

    public static final String CREATE_TIME = "create_time";

    public static final String CREATE_USER = "create_user";

    public static final String MODIFY_TIME = "modify_time";

    public static final String MODIFY_USER = "modify_user";

    public static final String DELETE_FLAG = "delete_flag";

    public static final String VERSION = "version";

    @Override
    protected Serializable pkVal() {
        return this.examValueId;
    }

}
