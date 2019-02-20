package lab.c505.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
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
 * @since 2019-02-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Mytest extends Model<Mytest> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "stu_id", type = IdType.AUTO)
    private Integer stuId;

    private String name;

    private Integer age;


    public static final String STU_ID = "stu_id";

    public static final String NAME = "name";

    public static final String AGE = "age";

    @Override
    protected Serializable pkVal() {
        return this.stuId;
    }

}
