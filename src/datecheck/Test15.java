package datecheck;

import java.util.Date;
import java.util.Scanner;
import datecheck.Exercise;
public class Test15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Date date = new Date();
        String monday = Exercise.getMonday(date);
        System.out.print("����һ������Ϊ��"+monday+"����");
        String nowStr = Exercise.DateToStr(date);
        // �� Date ���͵�����ת��Ϊ String ����
        int num = Exercise.getTwoDay(nowStr,monday);
        System.out.print("�������"+num+"����");
        System.out.println("\n��������Ҫ��ѯ�������ڼ������ڣ�1��ʾ����һ��2��ʾ���ڶ���)��");
        String weekNo = input.next();       //��ȡ�û����������
        int no = Integer.parseInt(weekNo);
        //���û����������ת��Ϊint���ͣ��Ա�ʹ��switch���
        String strWeekNo = "";
        switch(no) {
            case 1:
                strWeekNo = "����һ";
                break;
            case 2:
                strWeekNo = "���ڶ�";
                break;
            case 3:
                strWeekNo = "������";
                break;
            case 4:
                strWeekNo = "������";
                break;
            case 5:
                strWeekNo = "������";
                break;
            case 6:
                strWeekNo = "������";
                break;
            case 7:
                strWeekNo = "������";
                break;
        }
        System.out.println("���ܡ�"+strWeekNo+"��������Ϊ��"+
                Exercise.getWeek(nowStr,weekNo));
    }
}