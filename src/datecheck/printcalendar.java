package datecheck;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

//打印日历，以2021年10月为例
public class printcalendar {
    public static void main(String[]args){
        /*
        Calendar calendar = Calendar.getInstance();
        int numberMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        //获取每个月最大天数
        System.out.println(numberMonth);
        System.out.println("今天是本周第"+(calendar.get(Calendar.DAY_OF_WEEK)-1)+"天");
        System.out.println("现在是本月第"+(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH)+1)+"周");
        System.out.println("今天是本月第"+calendar.get(Calendar.DAY_OF_MONTH)+"天");
        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(2021,9,1);
        System.out.println("设置的新时间是"+calendar1.getTime());
        System.out.println("本月第一天是星期"+(calendar1.get(Calendar.DAY_OF_WEEK)-1));

        for (int n = 1;n<=numberMonth;n++){
            calendar1.set(Calendar.DAY_OF_MONTH,n);
            //设置一个月的第几天
            //System.out.println("现在是星期"+(calendar1.get(Calendar.DAY_OF_WEEK)-1));
            switch (calendar1.get(Calendar.DAY_OF_WEEK)-1){
                case 0:
                    System.out.print("星期天\t");
                    break;
                case 1:
                    System.out.print("星期一\t");
                    break;
                case 2:
                    System.out.print("星期二\t");
                    break;
                case 3:
                    System.out.print("星期三\t");
                    break;
                case 4:
                    System.out.print("星期四\t");
                    break;
                case 5:
                    System.out.print("星期五\t");
                    break;
                case 6:
                    System.out.print("星期六\t");
                    break;

            }
            if (calendar1.get(Calendar.DAY_OF_WEEK)-1==6){
                System.out.println();
            }
        }

         */
        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
        DateFormat df1 = DateFormat.getTimeInstance(DateFormat.SHORT);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.SHORT);
        DateFormat df3 = DateFormat.getInstance();
        System.out.println(df.format(new Date())+"\t"+df1.format(new Date()));
        Calendar calendar = df.getCalendar();
        System.out.println(calendar.getTime());
        System.out.println(df.getTimeZone());

    }
}
