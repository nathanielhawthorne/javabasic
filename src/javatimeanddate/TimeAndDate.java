package javatimeanddate;

import java.util.Date;

//Java时间日期的处理：Java Date类、Calendar类详解
public class TimeAndDate {
    public static void main(String[]args){
        Date date = new Date();
        System.out.println(date.toString());
        Date dateLong = new Date(60000);
        System.out.println(dateLong);
    }
}
