package Conditionalstatements;

import java.util.Scanner;

public class login {
    static String user = "admin";
    static String password = "root";
    static int verifycode = 0000;
    static String userinput;
    static String passwordinput;
    static int verifycodeinput;
    public static void main(String[]args){
        System.out.println("�������û�����");
        Scanner input1 =new Scanner(System.in);
        userinput = input1.next();
        System.out.println("----------------------------------------------");
        System.out.println("���������룺");
        Scanner input2 = new Scanner(System.in);
        passwordinput = input2.next();
        System.out.println("----------------------------------------------");
        System.out.println("��������֤�룺");
        Scanner input3 = new Scanner(System.in);
        verifycodeinput = input3.nextInt();
        if (userinput != user&&passwordinput!=password&&verifycodeinput!=verifycode){
            System.out.println("����������Ϣ�Ƿ���ȷ��");
            System.out.println("������������Ϣ��");
        }else {
            System.out.println("��½�ɹ�����ӭ������");
        }
    }
}
