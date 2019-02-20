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
 * 图书表
 * </p>
 *
 * @author TingTing W
 * @since 2019-02-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Book extends Model<Book> {

    private static final long serialVersionUID = 1L;

    /**
     * 图书ID
     */
    @TableId(value = "book_id", type = IdType.AUTO)
    private Long bookId;

    /**
     * 图书名称
     */
    private String name;

    /**
     * 馆藏数量
     */
    private Integer number;


    public static final String BOOK_ID = "book_id";

    public static final String NAME = "name";

    public static final String NUMBER = "number";

    @Override
    protected Serializable pkVal() {
        return this.bookId;
    }

}
