package lab.c505.dao;

import org.apache.ibatis.annotations.Param;
import lab.c505.entity.Appointment;

/**
 * Package: lab.c505.dao
 * Description： TODO
 * Author: TingTing W
 * Date: Created in 2018/10/17 15:34
 */
public interface AppointmentDao {
    /**
     * 插入预约图书记录
     *
     * @param bookId
     * @param studentId
     * @return 插入的行数
     */
    int insertAppointment(@Param("bookId") long bookId, @Param("studentId") long studentId);

    /**
     * 通过主键查询预约图书记录，并且携带图书实体
     *
     * @param bookId
     * @param studentId
     * @return
     */
    Appointment queryByKeyWithBook(@Param("bookId") long bookId, @Param("studentId") long studentId);
}
