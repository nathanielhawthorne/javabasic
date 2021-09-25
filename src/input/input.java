package input;

import java.util.Scanner;

public class input {
    static int number1 = 1;
    static int number2 = 2;
    public static void main(String[]args){
        System.out.println("请输入一个数字：");
        Scanner input1 =new Scanner(System.in);
        number1 = input1.nextInt();
        System.out.println("请输入一个数字：");
        Scanner input2 =new Scanner(System.in);
        number1 = input2.nextInt();
        if (number1>number2){System.out.println("第一个数要比第二个数大");}else {System.out.println("第一个数要比第二个数小");}

    }
}
