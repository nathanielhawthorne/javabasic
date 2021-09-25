package Wordguessinggame;

import java.util.Scanner;

public class Wordguessinggame {
    static int number = 100;
    static String input1;
    static int input2;
    public static void main(String[]args){
        System.out.println("猜字游戏，按q继续");
        Scanner input3 = new Scanner(System.in);
        input1 = input3.next();
        if (input1.equals("q")){
            System.out.println("请输入一个数字");
            Scanner input4 = new Scanner(System.in);
            input2 = input4.nextInt();
            if (input2>100){
                System.out.println("输入的数值太大");
            }else {
                System.out.println("输入的数值太小");
            }
        } else {
            System.out.println("请按q继续");
        }

    }
}
