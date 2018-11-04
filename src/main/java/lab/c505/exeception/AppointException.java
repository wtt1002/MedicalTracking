package lab.c505.exeception;

/**
 * Package: lab.c505.exeception
 * Description： 预约业务异常
 * Author: TingTing W
 * Date: Created in 2018/10/17 16:07
 */
public class AppointException extends RuntimeException {

    public AppointException(String message) {
        super(message);
    }

    public AppointException(String message, Throwable cause) {
        super(message, cause);
    }
}
