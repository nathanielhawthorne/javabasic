package input;

import java.util.Scanner;

public class input {
    static int number1 = 1;
    static int number2 = 2;
    public static void main(String[]args){
        System.out.println("������һ�����֣�");
        Scanner input1 =new Scanner(System.in);
        number1 = input1.nextInt();
        System.out.println("������һ�����֣�");
        Scanner input2 =new Scanner(System.in);
        number1 = input2.nextInt();
        if (number1>number2){System.out.println("��һ����Ҫ�ȵڶ�������");}else {System.out.println("��һ����Ҫ�ȵڶ�����С");}

    }
}
