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
@TableName("t_department")
public class Department extends Model<Department> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "dept_id", type = IdType.AUTO)
    private Integer deptId;

    private Integer hosId;

    private String deptName;

    /**
     * 科室名称首字母缩写，用于快速查询与检索
     */
    private String deptPy;

    private String deptLeader;

    private String deptAddress;

    private String deptTel;

    private String deptDetail;

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


    public static final String DEPT_ID = "dept_id";

    public static final String HOS_ID = "hos_id";

    public static final String DEPT_NAME = "dept_name";

    public static final String DEPT_PY = "dept_py";

    public static final String DEPT_LEADER = "dept_leader";

    public static final String DEPT_ADDRESS = "dept_address";

    public static final String DEPT_TEL = "dept_tel";

    public static final String DEPT_DETAIL = "dept_detail";

    public static final String CREATE_TIME = "create_time";

    public static final String CREATE_USER = "create_user";

    public static final String MODIFY_TIME = "modify_time";

    public static final String MODIFY_USER = "modify_user";

    public static final String DELETE_FLAG = "delete_flag";

    public static final String VERSION = "version";

    @Override
    protected Serializable pkVal() {
        return this.deptId;
    }

}
