package lab.c505.exeception;

/**
 * Package: lab.c505.exeception
 * Description： 库存不足异常
 * Author: TingTing W
 * Date: Created in 2018/10/17 16:07
 */
public class NoNumberException extends RuntimeException {

    public NoNumberException(String message) {
        super(message);
    }

    public NoNumberException(String message, Throwable cause) {
        super(message, cause);
    }
}
