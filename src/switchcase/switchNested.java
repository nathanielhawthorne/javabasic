package switchcase;

import java.util.Scanner;

public class switchNested {
    static int number1;
    static int number2;
    static int number3;
    public static void main(String[]args){
        System.out.println("��������Ϸ��");
        System.out.println("��Ϸ�����������룬�����ܹ���λ��ֻ��һ�λ��ᣬ���һ�����ּ�����ʧ��");
        System.out.println("��һ�����֣�");
        Scanner input1 = new Scanner(System.in);
        number1 = input1.nextInt();
        switch (number1){
            case 1:
                System.out.println("������ȷ");
                System.out.println("�ڶ�������");
                Scanner input2 = new Scanner(System.in);
                number2 = input2.nextInt();
                switch (number2){
                    case 2:
                        System.out.println("������ȷ");
                    case 4:
                        System.out.println("���ִ���");
                        System.out.println("���������һ�����֣�");
                        Scanner input3 =new Scanner(System.in);
                        number3 = input3.nextInt();
                        switch (number3){
                            case 3:
                                System.out.println("����������ȷ��");
                                break;
                            case 1:
                                System.out.println("�������");
                        }
                        break;

                    case 3:
                        System.out.println("�ܽӽ��ˣ����ͣ�");
                }
                break;
            case 2:
                System.out.println("����������������룺");
        }
    }
}
