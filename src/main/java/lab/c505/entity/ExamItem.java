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
 * 检查单项数据
 * </p>
 *
 * @author TingTing W
 * @since 2019-02-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_exam_item")
public class ExamItem extends Model<ExamItem> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "exam_item_id", type = IdType.AUTO)
    private Integer examItemId;

    private String examCategoryId;

    private String examItemCode;

    private String examItemName;

    private String shortName;

    private String itemUnit;

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


    public static final String EXAM_ITEM_ID = "exam_item_id";

    public static final String EXAM_CATEGORY_ID = "exam_category_id";

    public static final String EXAM_ITEM_CODE = "exam_item_code";

    public static final String EXAM_ITEM_NAME = "exam_item_name";

    public static final String SHORT_NAME = "short_name";

    public static final String ITEM_UNIT = "item_unit";

    public static final String CREATE_TIME = "create_time";

    public static final String CREATE_USER = "create_user";

    public static final String MODIFY_TIME = "modify_time";

    public static final String MODIFY_USER = "modify_user";

    public static final String DELETE_FLAG = "delete_flag";

    public static final String VERSION = "version";

    @Override
    protected Serializable pkVal() {
        return this.examItemId;
    }

}
