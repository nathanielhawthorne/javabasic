package javadateclass;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

//������
public class Program2 {
    public static void main(String[]ARGS){
        Calendar calendar = Calendar.getInstance();//��ȡ���ڵ�ʱ��
        System.out.println(calendar.getTime());//�����ڵ�ʱ��ת��Ϊ���ڡ��¡��ա�ʱ���롢ʱ������ĸ�ʽ
        calendar.add(2,1);//���·�������һ��
        System.out.println(calendar.getTime());//��ȡ���ĺ��ʱ��
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
        calendar.get(2);//����ָ�������ֶε�ֵ,�ֶ�Ϊ2
        System.out.println(calendar.getTime());
        int n1 = calendar1.getActualMaximum(3);//����ָ�������ֶο���ӵ�е����ֵ
        System.out.println(n1);
        int n2 = calendar2.getActualMinimum(2);//����ָ�������ֶο���ӵ�е���Сֵ
        System.out.println(n2);
        int n3 = calendar.getFirstDayOfWeek();
        //��ȡһ���ڵĵ�һ�졣���ݲ�ͬ�Ĺ��ҵ��������ز�ͬ��ֵ
        System.out.println("һ���ڵĵ�һ����"+n3);
        Calendar calendar3 = Calendar.getInstance(Locale.CHINA);
        //ʹ��ָ��ʱ����Ĭ�����Ի������һ������,ָ����ʱ��Ϊ�й�
        calendar3.getTime();
        System.out.println("�й�ʱ�����ڵ�ʱ��Ϊ��"+calendar3.getTime());
        Calendar calendar4 = Calendar.getInstance(Locale.CHINA);
        //static Calendar getInstance(TimeZone zone,Locale aLocale)
        // ʹ��ָ��ʱ�������Ի������һ������
        System.out.println("�й����ڵ�ʱ��Ϊ��"+calendar4.getTime());
        Date date = new Date();
        date.getTime();
        /*
        ����һ����ʾ�� Calendar ʱ��ֵ���Ӹ�������ʱ�� 1970 �� 01 �� 01 �� 00 ʱ
        00 �� 00 �������ڵĺ���ƫ�������� Date ����
         */
        System.out.println("��date��ʾ���ڵ�ʱ���ǣ�"+date);
        calendar.getTimeInMillis();
        /*
        ���ش� Calendar ��ʱ��ֵ���Ժ���Ϊ��λ���ӴӸ�������ʱ�� 1970 �� 01 �� 01 �� 00 ʱ
        00 �� 00 �������ڵĺ���ƫ����
         */
        System.out.println("������"+calendar.getTimeInMillis()+"����");
        calendar.set(2,1);
        //Ϊָ���������ֶ����ø���ֵ,��2������1
        System.out.println(calendar.getTime());
        calendar.set(1944,6,6);
        //����ָ����������
        System.out.println("�ֶ�����һ��ʱ�䣬ŵ���׵�½ʱ��Ϊ��"+calendar.getTime());
        //���������ֶ� YEAR��MONTH �� DAY_OF_MONTH ��ֵ
        calendar.set(1944,6,6,12,12,12);
        //�����ֶ� YEAR��MONTH��DAY_OF_MONTH��HOUR�� MINUTE �� SECOND ��ֵ
        System.out.println("�ֶ�����ʱ�䣬ŵ���׵�½������һ�ص�ʱ��Ϊ����������������֯��"+calendar.getTime());
        calendar1.setFirstDayOfWeek(6);
        //����һ���ڵĵ�һ������һ��
        System.out.println("����һ���ڵĵ�һ��Ϊ"+calendar1.getTime());
        calendar.setTimeInMillis(11111);
        //�ø����� long ֵ���ô� Calendar �ĵ�ǰʱ��ֵ����ȷ������
        System.out.println("�ֶ�������һ��ʱ�䣬�����ǣ�"+calendar.getTime());
        calendar.set(Calendar.YEAR,1944);
        System.out.println("���Ĺ���ݵ�ʱ��Ϊ"+calendar.getTime());
        calendar.set(Calendar.MONTH,6);
        System.out.println("���Ĺ��·��Ժ��ʱ��Ϊ��"+calendar.getTime());
        
    }
}
