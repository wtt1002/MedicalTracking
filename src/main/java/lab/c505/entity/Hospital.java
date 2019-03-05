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
 * 
 * </p>
 *
 * @author TingTing W
 * @since 2019-03-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_hospital")
public class Hospital extends Model<Hospital> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "hos_id", type = IdType.AUTO)
    private Integer hosId;

    private String hosName;

    private String hosPy;

    private String hosCode;

    private String hosRank;

    private String hosType;

    private String hosProvince;

    private String hosCity;

    private String hosDistrict;

    private Integer hosBeds;

    private String hosAddress;

    private String hosDetail;

    private String hosTel;

    private BigDecimal hosLongitude;

    private BigDecimal hosLatitude;

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


    public static final String HOS_ID = "hos_id";

    public static final String HOS_NAME = "hos_name";

    public static final String HOS_PY = "hos_py";

    public static final String HOS_CODE = "hos_code";

    public static final String HOS_RANK = "hos_rank";

    public static final String HOS_TYPE = "hos_type";

    public static final String HOS_PROVINCE = "hos_province";

    public static final String HOS_CITY = "hos_city";

    public static final String HOS_DISTRICT = "hos_district";

    public static final String HOS_BEDS = "hos_beds";

    public static final String HOS_ADDRESS = "hos_address";

    public static final String HOS_DETAIL = "hos_detail";

    public static final String HOS_TEL = "hos_tel";

    public static final String HOS_LONGITUDE = "hos_longitude";

    public static final String HOS_LATITUDE = "hos_latitude";

    public static final String CREATE_TIME = "create_time";

    public static final String CREATE_USER = "create_user";

    public static final String MODIFY_TIME = "modify_time";

    public static final String MODIFY_USER = "modify_user";

    public static final String DELETE_FLAG = "delete_flag";

    public static final String VERSION = "version";

    @Override
    protected Serializable pkVal() {
        return this.hosId;
    }

}
