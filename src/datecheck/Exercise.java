package datecheck;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class Exercise {
    // �ڸ�������5��������������Ĳ����н��ὲ�⣬����ʡ��
    // ��ȡָ�����������ܵ���һ����
    /*
     �� Exercise ���ж����ȡָ�����������ܵ���һ���ڵķ�������getMonday()
     ���÷�����һ����̬����������ֵΪ String ���ͣ�������Ҫ����һ�� Date ���͵Ĳ�����
     Ȼ�󽫸����ڲ�����Ϊ Calendar ��������ڣ�
     ������ Calendar ��� set(int field,int value)�����ı� Calendar �����е����ڣ�
     �ٽ�ʹ�� SimpleDateFormat ���ʽ��������ڷ��ء�

     */
    public static String getMonday(Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.set(Calendar.DAY_OF_WEEK,Calendar.MONDAY);
        return new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());
    }

    // ��ȡ�������ڼ���������
    /*
    ������ Exercise ���ж����ȡ�������ڼ���������ķ�������getTwoDay()��
    �÷�����Ҫ�������� String ���͵Ĳ�����

�ڸ÷����������У�������Ҫ����һ�� SimpleDateFormat ����󣬲�ָ�����ڵĸ�ʽ��
Ȼ����Ҫ���� SimpleDateFormat ����� parse() ������
�����ݹ��������� String ���͵�����ת��Ϊ Date ���ͣ�
���������� Date ���͵����ڽ������㣬�ó���������������һ�� int ���͵ı�����

getTwoDay() �����Ĵ���ʵ�����£�
     */
    public static int getTwoDay(String sj1, String sj2) {
        SimpleDateFormat myFormatter = new SimpleDateFormat("yyyy-MM-dd");
        int day = 0;
        try {
            Date date = myFormatter.parse(sj1);
            Date mydate = myFormatter.parse(sj2);
            // �����������ڼ���������
            day = (int)((date.getTime()-mydate.getTime())/(24*60*60*1000));
        } catch(Exception e) {
            return 0;
        }
        return day;
    }

    // ��String���͵�����ת��ΪDate����
    /*
    �� Exercise ���м�������������̬�������ֱ���� String ���͵������� Date �������ڵĻ������ܡ�
    �������£�
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
    // ��Date���͵�����ת��ΪString����
    public static String DateToStr(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String strDate = sdf.format(date);
        return strDate;
    }



    /*
     �� Exercise ���ж����ȡָ�����������ܵ�ָ�����ڵ����ڷ�������getWeek()��
     �÷�����Ҫ�������� String ���͵Ĳ��������е�һ��������ʾָ�������ڣ��ڶ���������ʾ���ڼ���

�ڸ÷����������У����ȵ����� strToDate() �������� String ���͵�����ת��Ϊ Date ���͵����ڣ�
������������Ϊ Calendar ��������ڣ�Ȼ���жϴ��ݹ����ĵڶ���������ֵ��
ʹ�� Calendar ���е� set(int field��int value) �����ı����ڣ��Ӷ�����ʽ��������ڷ��ء�

getWeek() �����Ĵ���ʵ�����£�
     */
    // ���һ�����������ܵ����ڼ������ڣ���Ҫ�ҳ�2011��5��1�������ܵ�����һ�Ǽ���
    // @param sdate��ȷ����������ʽ2011-05-01
    // @param numҪȷ�������ܼ���1��ʾ��һ��2��ʾ�ܶ���
    // @return
    public static String getWeek(String sdate, String num) {
        // ��ת��Ϊʱ��
        Date dd = strToDate(sdate);
        Calendar c = Calendar.getInstance();
        c.setTime(dd);
        int weekNo = Integer.parseInt(num);
        switch (weekNo) {
            case 1:
                c.set(Calendar.DAY_OF_WEEK,Calendar.MONDAY);
                //��������һ���ڵ�����
                break;
            case 2:
                c.set(Calendar.DAY_OF_WEEK,Calendar.TUESDAY);
                //�������ڶ����ڵ�����
                break;
            case 3:
                c.set(Calendar.DAY_OF_WEEK,Calendar.WEDNESDAY);
                //�������������ڵ�����
                break;
            case 4:
                c.set(Calendar.DAY_OF_WEEK,Calendar.THURSDAY);
                //�������������ڵ�����
                break;
            case 5:
                c.set(Calendar.DAY_OF_WEEK,Calendar.FRIDAY);
                //�������������ڵ�����
                break;
            case 6:
                c.set(Calendar.DAY_OF_WEEK,Calendar.SATURDAY);
                //�������������ڵ�Ի��
                break;
            case 7:
                c.set(Calendar.DAY_OF_WEEK,Calendar.SUNDAY);
                //��������Ի���ڵ�����
                break;
        }
        return new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());
    }


}