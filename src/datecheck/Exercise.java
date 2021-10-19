package datecheck;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class Exercise {
    // 在该类中有5个方法，在下面的步骤中将会讲解，这里省略
    // 获取指定日期所在周的周一日期
    /*
     在 Exercise 类中定义获取指定日期所在周的周一日期的方法——getMonday()
     ，该方法是一个静态方法，返回值为 String 类型，并且需要传递一个 Date 类型的参数，
     然后将该日期参数作为 Calendar 对象的日期，
     并调用 Calendar 类的 set(int field,int value)方法改变 Calendar 对象中的日期，
     再将使用 SimpleDateFormat 类格式化后的日期返回。

     */
    public static String getMonday(Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.set(Calendar.DAY_OF_WEEK,Calendar.MONDAY);
        return new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());
    }

    // 获取两个日期间相差的天数
    /*
    继续在 Exercise 类中定义获取两个日期间相差天数的方法——getTwoDay()，
    该方法需要传递两个 String 类型的参数。

在该方法的主体中，首先需要创建一个 SimpleDateFormat 类对象，并指定日期的格式，
然后需要调用 SimpleDateFormat 对象的 parse() 方法，
将传递过来的两个 String 类型的日期转换为 Date 类型，
并将这两个 Date 类型的日期进行运算，得出相差的天数，返回一个 int 类型的变量。

getTwoDay() 方法的代码实现如下：
     */
    public static int getTwoDay(String sj1, String sj2) {
        SimpleDateFormat myFormatter = new SimpleDateFormat("yyyy-MM-dd");
        int day = 0;
        try {
            Date date = myFormatter.parse(sj1);
            Date mydate = myFormatter.parse(sj2);
            // 计算两个日期间相差的天数
            day = (int)((date.getTime()-mydate.getTime())/(24*60*60*1000));
        } catch(Exception e) {
            return 0;
        }
        return day;
    }

    // 将String类型的日期转换为Date类型
    /*
    在 Exercise 类中继续创建两个静态方法，分别完成 String 类型的日期与 Date 类型日期的互换功能。
    代码如下：
     */
    public static Date strToDate(String strDate) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = sdf.parse(strDate);
        } catch(ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
    // 将Date类型的日期转换为String类型
    public static String DateToStr(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String strDate = sdf.format(date);
        return strDate;
    }



    /*
     在 Exercise 类中定义获取指定日期所在周的指定星期的日期方法——getWeek()，
     该方法需要传递两个 String 类型的参数，其中第一个参数表示指定的日期，第二个参数表示星期几。

在该方法的主体中，首先调用了 strToDate() 方法，将 String 类型的日期转换为 Date 类型的日期，
并将该日期作为 Calendar 类对象日期，然后判断传递过来的第二个参数的值，
使用 Calendar 类中的 set(int field，int value) 方法改变日期，从而将格式化后的日期返回。

getWeek() 方法的代码实现如下：
     */
    // 获得一个日期所在周的星期几的日期，如要找出2011年5月1日所在周的星期一是几号
    // @param sdate所确定的日期形式2011-05-01
    // @param num要确定的是周几（1表示周一，2表示周二）
    // @return
    public static String getWeek(String sdate, String num) {
        // 再转换为时间
        Date dd = strToDate(sdate);
        Calendar c = Calendar.getInstance();
        c.setTime(dd);
        int weekNo = Integer.parseInt(num);
        switch (weekNo) {
            case 1:
                c.set(Calendar.DAY_OF_WEEK,Calendar.MONDAY);
                //返回星期一所在的日期
                break;
            case 2:
                c.set(Calendar.DAY_OF_WEEK,Calendar.TUESDAY);
                //返回星期二所在的日期
                break;
            case 3:
                c.set(Calendar.DAY_OF_WEEK,Calendar.WEDNESDAY);
                //返回星期三所在的日期
                break;
            case 4:
                c.set(Calendar.DAY_OF_WEEK,Calendar.THURSDAY);
                //返回星期四所在的日期
                break;
            case 5:
                c.set(Calendar.DAY_OF_WEEK,Calendar.FRIDAY);
                //返回星期五所在的日期
                break;
            case 6:
                c.set(Calendar.DAY_OF_WEEK,Calendar.SATURDAY);
                //返回星期六所在的曰期
                break;
            case 7:
                c.set(Calendar.DAY_OF_WEEK,Calendar.SUNDAY);
                //返回星期曰所在的日期
                break;
        }
        return new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());
    }


}