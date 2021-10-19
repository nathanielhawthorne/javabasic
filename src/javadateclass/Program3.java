package javadateclass;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

//使用 DateFormat 类格式化曰期/时间的示例如下：
public class Program3 {
    public static void main(String[]args){
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.SHORT, Locale.CHINA);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.MEDIUM,Locale.CHINA);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.LONG,Locale.CHINA);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL,Locale.CHINA);

        DateFormat df5 = DateFormat.getTimeInstance(DateFormat.SHORT,Locale.CHINA);
        DateFormat df6 = DateFormat.getTimeInstance(DateFormat.LONG,Locale.CHINA);
        DateFormat df7 = DateFormat.getTimeInstance(DateFormat.MEDIUM,Locale.CHINA);
        DateFormat df8 = DateFormat.getTimeInstance(DateFormat.FULL,Locale.CHINA);

        String date1 = df1.format(new Date());
        String date2 = df2.format(new Date());
        String date3 = df3.format(new Date());
        String date4 = df4.format(new Date());

        String date5 = df5.format(new Date());
        String date6 = df6.format(new Date());
        String date7 = df7.format(new Date());
        String date8 = df8.format(new Date());

        System.out.print("short："+"date:"+date1+" "+"time:"+date5+"\n");
        System.out.print("long："+"date:"+date3+" "+"time:"+date6+"\n");
        System.out.print("medium："+"date:"+date2+" "+"time:"+date7+"\n");
        System.out.print("full："+"date:"+date4+" "+"time:"+date8);

    }
}
