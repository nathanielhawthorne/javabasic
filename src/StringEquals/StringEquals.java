package StringEquals;

import java.util.Scanner;

//�������벢ȷ������
public class StringEquals {
    static String passwdFirst;
    static String passwdSecond;
    public static void main(String[]args){
        System.out.println("***************************************");
        System.out.println("***                                 ***");
        System.out.println("***             ��¼����              ***");
        System.out.println("***                                 ***");
        System.out.println("***************************************");
        System.out.println("������������룺");
        Scanner input = new Scanner(System.in);
        passwdFirst = input.next();
        System.out.println("���ٴ�����������룺");
        Scanner input1 = new Scanner(System.in);
        passwdSecond = input1.next();
        if (passwdFirst.equals(passwdSecond)){
            System.out.println("����¼��ɹ�����������ǣ�"+passwdFirst);
        }else {
            System.out.println("�ڶ����������һ�����벻�Ǻϣ����������룺");
            do {
                //System.out.println("������������룺");
                Scanner input2 = new Scanner(System.in);
                passwdFirst = input2.next();
                System.out.println("���ٴ�����������룺");
                Scanner input3 = new Scanner(System.in);
                passwdSecond = input3.next();
            } while (!passwdFirst.equals(passwdSecond));
            System.out.println("����¼��ɹ�����������ǣ�" + passwdFirst);
        }
    }
}
