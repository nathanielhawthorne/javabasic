package javatimeanddate;

import java.util.Date;

//Javaʱ�����ڵĴ���Java Date�ࡢCalendar�����
public class TimeAndDate {
    public static void main(String[]args){
        Date date = new Date();
        System.out.println(date.toString());
        Date dateLong = new Date(60000);
        System.out.println(dateLong);
    }
}
