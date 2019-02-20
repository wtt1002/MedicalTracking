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
 * 营养处方表
 * </p>
 *
 * @author TingTing W
 * @since 2019-02-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_nutrition_prescription")
public class NutritionPrescription extends Model<NutritionPrescription> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "nutrition_prescription_id", type = IdType.AUTO)
    private Integer nutritionPrescriptionId;

    private BigDecimal heatQuantity;

    private BigDecimal saccharides;

    private BigDecimal fat;

    private BigDecimal protein;

    private String otherInfo;

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


    public static final String NUTRITION_PRESCRIPTION_ID = "nutrition_prescription_id";

    public static final String HEAT_QUANTITY = "heat_quantity";

    public static final String SACCHARIDES = "saccharides";

    public static final String FAT = "fat";

    public static final String PROTEIN = "protein";

    public static final String OTHER_INFO = "other_info";

    public static final String FOLLOW_UP_ID = "follow_up_id";

    public static final String CREATE_TIME = "create_time";

    public static final String CREATE_USER = "create_user";

    public static final String MODIFY_TIME = "modify_time";

    public static final String MODIFY_USER = "modify_user";

    public static final String DELETE_FLAG = "delete_flag";

    public static final String VERSION = "version";

    @Override
    protected Serializable pkVal() {
        return this.nutritionPrescriptionId;
    }

}
