package Wordguessinggame;

import java.util.Scanner;

public class Wordguessinggame2 {
    static int number1 = 100;
    static int number2;
    static String a = "���ս��";
    static String b = "���������̫����";
    static String c = "�������Χ��";
    public static void main(String[]args){
        System.out.println("������һ�����֣�");
        Scanner number3 = new Scanner(System.in);
        number2 = number3.nextInt();
        a = number2>100 ? b : c;
        System.out.println(a);
        if (a==b){
            System.out.println("�������ֵ̫����");
        }else if(a==c){
            System.out.println("�������Χ��");
        }
    }
}
