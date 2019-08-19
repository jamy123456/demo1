package demo1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by jamy on 2019-08-09
 */
public class DateTimeDemo {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String str = dtf.format(ldt).substring(0, 19);
        System.out.println(str);
        LocalDate ld = LocalDate.now();
        ldt = ld.atTime(LocalTime.now());
        str = dtf.format(ldt);
        System.out.println(str);
    }
}
