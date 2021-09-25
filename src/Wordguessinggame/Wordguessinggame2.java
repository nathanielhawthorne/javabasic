package Wordguessinggame;

import java.util.Scanner;

public class Wordguessinggame2 {
    static int number1 = 100;
    static int number2;
    static String a = "最终结果";
    static String b = "输入的数字太大了";
    static String c = "在这个范围内";
    public static void main(String[]args){
        System.out.println("请输入一个数字：");
        Scanner number3 = new Scanner(System.in);
        number2 = number3.nextInt();
        a = number2>100 ? b : c;
        System.out.println(a);
        if (a==b){
            System.out.println("输入的数值太大了");
        }else if(a==c){
            System.out.println("在这个范围内");
        }
    }
}
