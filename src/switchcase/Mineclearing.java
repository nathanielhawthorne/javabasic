package switchcase;

import java.util.Scanner;

public class Mineclearing {
    static String start;
    static int number;
    public static void main(String[]args){
        System.out.println("����һ��ɨ����Ϸ���׳���9����9�����Ϳ���1-9��������ÿ������һ�����ִ���һ�����񣬱���23����ڶ��е����ţ�������q��ʼ��Ϸ��");
        Scanner input = new Scanner(System.in);
        start = input.next();
        if (start.equals("q")) {
            System.out.println("��Ϸ��ʼ��");
            System.out.println("�������׳�����xy��x�����У�y�����У������о��У���");
            Scanner input2 = new Scanner(System.in);
            number = input2.nextInt();
            int number1 = number%2;
            switch (number1) {
                case 1:
                    System.out.println("��ȵ����ˣ�");
                    break;
                case 0:
                    System.out.println("���������գ�û�ȵ���");
                    break;
            }
        }else {
            System.out.println("�밴q��ʼ��Ϸ!��");
        }
    }
}
