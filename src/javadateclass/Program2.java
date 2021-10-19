package javadateclass;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

//日历类
public class Program2 {
    public static void main(String[]ARGS){
        Calendar calendar = Calendar.getInstance();//获取现在的时间
        System.out.println(calendar.getTime());//将现在的时间转化为星期、月、日、时分秒、时区、年的格式
        calendar.add(2,1);//在月份上增加一个
        System.out.println(calendar.getTime());//获取更改后的时间
        calendar.add(3,1);
        System.out.println(calendar.getTime());
        System.out.println("----------------------------------------------");
        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(2021,10,15);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(2020,10,20);
        boolean bool = calendar1.after(calendar2);
        boolean bool2 = calendar1.before(calendar2);
        int n = calendar1.compareTo(calendar2);
        System.out.println(bool);
        System.out.println(bool2);
        System.out.println(n);
        calendar.get(2);//返回指定日历字段的值,字段为2
        System.out.println(calendar.getTime());
        int n1 = calendar1.getActualMaximum(3);//返回指定日历字段可能拥有的最大值
        System.out.println(n1);
        int n2 = calendar2.getActualMinimum(2);//返回指定日历字段可能拥有的最小值
        System.out.println(n2);
        int n3 = calendar.getFirstDayOfWeek();
        //获取一星期的第一天。根据不同的国家地区，返回不同的值
        System.out.println("一星期的第一天是"+n3);
        Calendar calendar3 = Calendar.getInstance(Locale.CHINA);
        //使用指定时区和默认语言环境获得一个日历,指定的时区为中国
        calendar3.getTime();
        System.out.println("中国时区现在的时间为："+calendar3.getTime());
        Calendar calendar4 = Calendar.getInstance(Locale.CHINA);
        //static Calendar getInstance(TimeZone zone,Locale aLocale)
        // 使用指定时区和语言环境获得一个日历
        System.out.println("中国现在的时间为："+calendar4.getTime());
        Date date = new Date();
        date.getTime();
        /*
        返回一个表示此 Calendar 时间值（从格林威治时间 1970 年 01 月 01 日 00 时
        00 分 00 秒至现在的毫秒偏移量）的 Date 对象
         */
        System.out.println("用date表示现在的时间是："+date);
        calendar.getTimeInMillis();
        /*
        返回此 Calendar 的时间值，以毫秒为单位，从从格林威治时间 1970 年 01 月 01 日 00 时
        00 分 00 秒至现在的毫秒偏移量
         */
        System.out.println("现在是"+calendar.getTimeInMillis()+"毫秒");
        calendar.set(2,1);
        //为指定的日历字段设置给定值,在2上设置1
        System.out.println(calendar.getTime());
        calendar.set(1944,6,6);
        //设置指定的年月日
        System.out.println("手动设置一个时间，诺曼底登陆时间为："+calendar.getTime());
        //设置日历字段 YEAR、MONTH 和 DAY_OF_MONTH 的值
        calendar.set(1944,6,6,12,12,12);
        //设置字段 YEAR、MONTH、DAY_OF_MONTH、HOUR、 MINUTE 和 SECOND 的值
        System.out.println("手动设置时间，诺曼底登陆肠子流一地的时间为，到处都是人体组织："+calendar.getTime());
        calendar1.setFirstDayOfWeek(6);
        //设置一星期的第一天是哪一天
        System.out.println("设置一星期的第一天为"+calendar1.getTime());
        calendar.setTimeInMillis(11111);
        //用给定的 long 值设置此 Calendar 的当前时间值，精确到毫秒
        System.out.println("手动设置了一个时间，现在是："+calendar.getTime());
        calendar.set(Calendar.YEAR,1944);
        System.out.println("更改过年份的时间为"+calendar.getTime());
        calendar.set(Calendar.MONTH,6);
        System.out.println("更改过月份以后的时间为："+calendar.getTime());
        
    }
}
