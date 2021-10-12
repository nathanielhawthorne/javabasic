package javatimeanddate;

import java.util.Calendar;
import java.util.Date;

//Calendar 类
public class javadate {
    public static void main(String[]args){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        System.out.println(calendar.getTime());
        int year = calendar.get(Calendar.YEAR);
        System.out.println("今年是"+year+"年");
        int month = calendar.get(Calendar.MONTH);
        System.out.println("现在是"+month+"月");
        int week = calendar.get(Calendar.WEEK_OF_YEAR);
        System.out.println("现在是今年第"+week+"周");
        int hour = calendar.get(Calendar.HOUR);
        System.out.println("现在是"+hour+"点");
        int minute = calendar.get(Calendar.MINUTE);
        System.out.println("现在是"+minute+"分钟");
        int second = calendar.get(Calendar.SECOND);
        System.out.println("现在是"+second+"秒");
        int millisecond = calendar.get(Calendar.MILLISECOND);
        System.out.println("现在是"+millisecond+"毫秒");
        int week_of_month = calendar.get(Calendar.WEEK_OF_MONTH);
        System.out.println("现在是这个月第"+week_of_month+"周");
        int day_of_week_of_month = calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH);
        System.out.println("现在是这个月这一周第"+day_of_week_of_month+"天");
        int day_of_week = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println("现在是这周第"+day_of_week+"天");


    }
}
