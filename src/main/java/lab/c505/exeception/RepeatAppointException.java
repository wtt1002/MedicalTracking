package lab.c505.exeception;

/**
 * Package: lab.c505.exeception
 * Description： 重复预约异常
 * Author: TingTing W
 * Date: Created in 2018/10/17 16:07
 */
public class RepeatAppointException extends RuntimeException {

    public RepeatAppointException(String message) {
        super(message);
    }

    public RepeatAppointException(String message, Throwable cause) {
        super(message, cause);
    }
}
