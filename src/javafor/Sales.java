package javafor;

import java.util.Scanner;
//��дһ�� Java ����ͳ��ĳ�����ϰ��������������Ҫ�����û�����ÿ�µ�������
public class Sales {
    static int mountOfMonth;
    static int mount;
    public static void main(String[]args){
        for (int number = 1;number<=6;number++) {
            System.out.println("������"+number+"�µ���������");
            Scanner input1 = new Scanner(System.in);
            mountOfMonth = input1.nextInt();
            mount += mountOfMonth;
        }
        System.out.println("�ϰ�����������Ϊ��"+mount);
    }
}
