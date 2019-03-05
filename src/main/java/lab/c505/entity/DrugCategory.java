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
 * 药物类别表
 * </p>
 *
 * @author TingTing W
 * @since 2019-03-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_drug_category")
public class DrugCategory extends Model<DrugCategory> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "drug_category_id", type = IdType.AUTO)
    private Integer drugCategoryId;

    private String drugCategoryCode;

    private String drugCategoryName;

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


    public static final String DRUG_CATEGORY_ID = "drug_category_id";

    public static final String DRUG_CATEGORY_CODE = "drug_category_code";

    public static final String DRUG_CATEGORY_NAME = "drug_category_name";

    public static final String CREATE_TIME = "create_time";

    public static final String CREATE_USER = "create_user";

    public static final String MODIFY_TIME = "modify_time";

    public static final String MODIFY_USER = "modify_user";

    public static final String DELETE_FLAG = "delete_flag";

    public static final String VERSION = "version";

    @Override
    protected Serializable pkVal() {
        return this.drugCategoryId;
    }

}
