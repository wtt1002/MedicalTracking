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
 * 康复训练类别表
 * </p>
 *
 * @author TingTing W
 * @since 2019-03-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_rehabilitation_train_category")
public class RehabilitationTrainCategory extends Model<RehabilitationTrainCategory> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "rehabilitation_train_category_id", type = IdType.UUID)
    private String rehabilitationTrainCategoryId;

    private String rehabilitationTrainCategoryCode;

    private String rehabilitationTrainCategoryName;

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


    public static final String REHABILITATION_TRAIN_CATEGORY_ID = "rehabilitation_train_category_id";

    public static final String REHABILITATION_TRAIN_CATEGORY_CODE = "rehabilitation_train_category_code";

    public static final String REHABILITATION_TRAIN_CATEGORY_NAME = "rehabilitation_train_category_name";

    public static final String CREATE_TIME = "create_time";

    public static final String CREATE_USER = "create_user";

    public static final String MODIFY_TIME = "modify_time";

    public static final String MODIFY_USER = "modify_user";

    public static final String DELETE_FLAG = "delete_flag";

    public static final String VERSION = "version";

    @Override
    protected Serializable pkVal() {
        return this.rehabilitationTrainCategoryId;
    }

}
