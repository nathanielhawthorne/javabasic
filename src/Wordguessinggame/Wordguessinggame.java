package Wordguessinggame;

import java.util.Scanner;

public class Wordguessinggame {
    static int number = 100;
    static String input1;
    static int input2;
    public static void main(String[]args){
        System.out.println("������Ϸ����q����");
        Scanner input3 = new Scanner(System.in);
        input1 = input3.next();
        if (input1.equals("q")){
            System.out.println("������һ������");
            Scanner input4 = new Scanner(System.in);
            input2 = input4.nextInt();
            if (input2>100){
                System.out.println("�������ֵ̫��");
            }else {
                System.out.println("�������ֵ̫С");
            }
        } else {
            System.out.println("�밴q����");
        }

    }
}
