package airticket;

import java.util.Scanner;

public class ticket {
    //Java��Ŀʵս��ʵ�ֵ������ɻ�Ʊ���ۣ�����һ����������Ʊ��ѯϵͳ��
    //����
    static double fare1 = 1000;
    static int fare2;
    static String stationstart;
    static String stationend;
    static String season1 = "Off season";
    static String season2 = "Peak season";
    static int month;
    public static void main(String[]args){
        System.out.println("���������վ��ֻ���Ϻ�����");
        Scanner input1 = new Scanner(System.in);
        stationstart = input1.next();
        System.out.println("�����뵽��վ�����������ݣ���");
        Scanner input2 = new Scanner(System.in);
        stationend = input2.next();
        System.out.println("������Ҫ�������·ݣ�");
        Scanner input3 = new Scanner(System.in);
        month = input3.nextInt();
        if (month>=3&&month<=6&&month>=10&&month<=12){
            if (stationstart.equals("�Ϻ�")&&stationend.equals("����")){
                double farediscount = 0.65*fare1;
                System.out.println("��������������Ʊ�������ۣ���Ʊ�۸�Ϊ��"+farediscount);
            }else if (stationstart.equals("�Ϻ�")&&stationend.equals("����")){
                double farediscount = 0.75*fare1;
                System.out.println("��������������Ʊ�������ۣ���Ʊ�۸�Ϊ��"+farediscount);
            }

        }else {
            if (stationstart.equals("�Ϻ�")&&stationend.equals("����")){
                double farediscount = 0.35*fare1;
                System.out.println("��������������Ʊ�������ۣ���Ʊ�۸�Ϊ��"+farediscount);
            }else if (stationstart.equals("�Ϻ�")&&stationend.equals("����")){
                double farediscount = 0.45*fare1;
                System.out.println("�����ǵ�������Ʊ�������ۣ���Ʊ�۸�Ϊ��"+farediscount);
            }
        }

    }
}
