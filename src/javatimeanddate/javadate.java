package javatimeanddate;

import java.util.Calendar;
import java.util.Date;

//Calendar ��
public class javadate {
    public static void main(String[]args){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        System.out.println(calendar.getTime());
        int year = calendar.get(Calendar.YEAR);
        System.out.println("������"+year+"��");
        int month = calendar.get(Calendar.MONTH);
        System.out.println("������"+month+"��");
        int week = calendar.get(Calendar.WEEK_OF_YEAR);
        System.out.println("�����ǽ����"+week+"��");
        int hour = calendar.get(Calendar.HOUR);
        System.out.println("������"+hour+"��");
        int minute = calendar.get(Calendar.MINUTE);
        System.out.println("������"+minute+"����");
        int second = calendar.get(Calendar.SECOND);
        System.out.println("������"+second+"��");
        int millisecond = calendar.get(Calendar.MILLISECOND);
        System.out.println("������"+millisecond+"����");
        int week_of_month = calendar.get(Calendar.WEEK_OF_MONTH);
        System.out.println("����������µ�"+week_of_month+"��");
        int day_of_week_of_month = calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH);
        System.out.println("�������������һ�ܵ�"+day_of_week_of_month+"��");
        int day_of_week = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println("���������ܵ�"+day_of_week+"��");


    }
}
