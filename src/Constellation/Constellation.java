package Constellation;

import java.util.Scanner;

public class Constellation {
    //Java��Ŀʵս�����ݳ������ڼ��㣨�жϣ�����
    static long day;
    static String birthday = "xx��xx��";
    public static void main(String[]args){
        System.out.println("������������գ�����xx��xx�ţ�");
        Scanner input1 = new Scanner(System.in);
        birthday = input1.next();
        String str1 = birthday.substring(0,2);
        String str2 = birthday.substring(3,5);
        long number1 = Long.valueOf(str1).longValue();
        //��������ַ���������Ҫ����ת��Ϊ���α�������ķ�Χѡ�񣬸�ʽ����ͳһ����Ȼ��֪������Щ�ַ���ת��Ϊ����
        //������㣬���Ҫ�����·ݺͺ�����λ���������򽫱�ø���
        long number2 = Long.valueOf(str2).longValue();
        day = number2;
        String str3 = birthday.substring(2,3);
        String str4 = birthday.substring(birthday.length()-1);
        //���ַ������һλֵ
        int length = birthday.length();
        if (number1>=1L&&number1<=12L&&number2>=1L&&number2<=31L&&str3.equals("��")&&str4.equals("��")&&length==6){
            if (str1.equals("01")&&day>=21&&day<=31){
                System.out.println("����ˮƿ��");
            }else if (str1.equals("02")&&day>=1&&day<=19){
                System.out.println("����ˮƿ��");
            }else if (str1.equals("02")&&day>=20&&day<=29){
                System.out.println("����˫����");
            }else if (str1.equals("03")&&day>=1&&day<=20){
                System.out.println("����˫����");
            }else if (str1.equals("03")&&day>=21&&day<=31){
                System.out.println("���ǰ�����");
            }else if (str1.equals("04")&&day>=1&&day<=20){
                System.out.println("���ǰ�����");
            }else if (str1.equals("04")&&day>=21&&day<=30){
                System.out.println("���ǽ�ţ��");
            }else if (str1.equals("05")&&day>=1&&day<=21){
                System.out.println("���ǽ�ţ��");
            }else if (str1.equals("05")&&day>=22&&day<=31){
                System.out.println("����˫����");
            }else if (str1.equals("06")&&day>=1&&day<=21){
                System.out.println("����˫����");
            }else if (str1.equals("06")&&day>=22&&day<=30){
                System.out.println("���Ǿ�з��");
            }else if (str1.equals("07")&&day>=1&&day<=23){
                System.out.println("���Ǿ�з��");
            }else if (str1.equals("07")&&day>=24&&day<=31){
                System.out.println("����ʨ����");
            }else if (str1.equals("08")&&day>=1&&day<=23){
                System.out.println("����ʨ����");
            }else if (str1.equals("08")&&day>=24&&day<=31){
                System.out.println("���Ǵ�Ů��");
            }else if (str1.equals("09")&&day>=1&&day<=23){
                System.out.println("���Ǵ�Ů��");
            }else if (str1.equals("09")&&day>=24&&day<=30){
                System.out.println("���������");
            }else if (str1.equals("10")&&day>=1&&day<=23){
                System.out.println("���������");
            }else if (str1.equals("10")&&day>=24&&day<=31){
                System.out.println("������Ы��");
            }else if (str1.equals("11")&&day>=1&&day<=22){
                System.out.println("������Ы��");
            }else if (str1.equals("11")&&day>=23&&day<=30){
                System.out.println("����������");
            }else if (str1.equals("12")&&day>=1&&day<=22){
                System.out.println("����������");
            }else if (str1.equals("12")&&day>=23&&day<=31){
                System.out.println("����Ħ����");
            }else {
                System.out.println("����Ħ����");
            }
        }else {
            System.out.println("������ĸ�ʽ���������Ժ������룡");
        }

    }
}
