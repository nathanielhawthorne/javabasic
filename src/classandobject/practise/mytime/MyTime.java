package classandobject.practise.mytime;
/*
11 .��ĳ�Ա�����뷽�������췽�� �ڳ����о���Ҫ��ʱ����в������ǲ�û��ʱ�����͵����ݡ�
��ô���ǿ����Լ�ʵ��һ��ʱ��������������е���Ҫ��������ΪMyTime����,����Ӧ���������ͳ�Ա,ʱ hour����minute��
��second��Ϊ�˱�֤���ݵİ�ȫ�ԣ���������Ա����Ӧ����Ϊ˽�С�ΪMyTime�ඨ�幹�췽���Է��㴴������ʱ��ʼ����Ա������
�ٶ���diaplay�������ڽ�ʱ����Ϣ��ӡ������ ΪMyTime��������·����� addSecond(int sec)�� addMinute(int min)��
 addHour(int hou) ��subSecond(int sec) ��subMinute(int min)�� subHour(int hou)��
 �ֱ��ʱ���֡�����мӼ����㡣 ��Ϊ��������һ�鹹�췽�� ���Է���ʹ�����ܹ��Զ�����ʽ��ʼ�������ʵ����
-----------------------------------
java���������ϰ��
https://blog.51cto.com/u_15054039/3543932
 */
public class MyTime {
    private double hour;
    private double minute;
    private double second;

    public MyTime(double hour,double minute,double second){
        this.hour = hour;
        this.minute = minute;
        this.second =second;

    }
    public void printInfo(){
        System.out.println(hour+"��"+minute+"��"+second+"��");
    }
    public void addSecond(int sec){
        second +=sec;
        System.out.println("������"+sec+"����ʱ��");
    }
    public void addMinute(int min){
        minute +=min;
        System.out.println("������"+min+"���Ӻ��ʱ��");
    }
    public void addHour(int h){
        hour +=h;
        System.out.println("������"+h+"Сʱ���ʱ��");
    }

}
