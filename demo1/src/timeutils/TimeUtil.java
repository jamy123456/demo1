package timeutils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Calendar;
import java.util.Date;

public class TimeUtil {
    public static void main(String[] args) {
        System.out.println("距离当天最后时间还有"+TimeUtil.getMaxTimeOfCurrentDayNew()+"秒");
        System.out.println("距离当天最后时间还有"+(TimeUtil.getMaxTimeOfCurrentDayNew()  / 3600)+"小时");
        System.out.println("距离当月最后时间还有"+TimeUtil.getMaxTimeOfCurrentMonthNew()+"秒");
        System.out.println("距离当月最后时间还有"+(TimeUtil.getMaxTimeOfCurrentMonthNew()  / 3600)+"小时");
    }

    // 获取本月最后一天的最后时间(旧)
    public static Date getMaxDateOfCurrentMonth(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        return calendar.getTime();
    }

    // 距离当天最后时间(秒)
    public static long getMaxTimeOfCurrentDayNew(){
        LocalDateTime ldt = LocalDateTime.now();
        LocalDate ld = LocalDate.now();
        long t1 = ldt.toEpochSecond(ZoneOffset.of("+8"));
        long t2 = ld.atTime(23,59,59).toEpochSecond(ZoneOffset.of("+8"));
        return t2 - t1;
    }

    // 距离当月最后时间(秒)
    public static long getMaxTimeOfCurrentMonthNew(){
        LocalDateTime ldt = LocalDateTime.now();
        LocalDate ld = LocalDate.now();
        long t1 = ldt.toEpochSecond(ZoneOffset.of("+8"));
        long t2 = ld.withDayOfMonth(ld.lengthOfMonth()).atTime(23, 59, 59).toEpochSecond(ZoneOffset.of("+8"));
        return t2 - t1;
    }



    // 获取当天最后时间
    public static Date getMaxTimeOfCurrentDay(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        return calendar.getTime();
    }

    //获取昨天的最后时间
    public static Date getMaxTimeOfYesterday(){
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, -1);
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        return calendar.getTime();
    }

    //获取上个月最后时间
    public static Date getMaxDateOfLastMonth(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        calendar.add(Calendar.DATE, -1);
        calendar.set(Calendar.DAY_OF_MONTH, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        return calendar.getTime();
    }

}
