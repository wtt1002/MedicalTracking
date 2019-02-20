package lab.c505.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 预约图书表
 * </p>
 *
 * @author TingTing W
 * @since 2019-02-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Appointment extends Model<Appointment> {

    private static final long serialVersionUID = 1L;

    /**
     * 图书ID
     */
    private Long bookId;

    /**
     * 学号
     */
    private Long studentId;

    /**
     * 预约时间
     */
    private LocalDateTime appointTime;


    public static final String BOOK_ID = "book_id";

    public static final String STUDENT_ID = "student_id";

    public static final String APPOINT_TIME = "appoint_time";

    @Override
    protected Serializable pkVal() {
        return this.bookId;
    }

}
