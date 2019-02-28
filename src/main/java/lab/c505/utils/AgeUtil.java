package lab.c505.utils;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

/**
 * Package: lab.c505.utils
 * Description： 根据生日获取年龄
 * Author: TingTing W
 * Date: Created in 2019/2/27 10:58
 */
public class AgeUtil {
    public static int getAgeByBirth(LocalDate birthday) throws Exception{
        LocalDate date = LocalDate.now();
        if (birthday == null){
            return -1;
        }
        return birthday.until(date).getYears();
    }
}
