package classandobject.practise.usernamepasswd;

import java.util.Scanner;

public class Main {
    static String inputString;
    static String inputString1;
    public static void main(String[]args){
        System.out.println("�����û�����");
        Scanner input = new Scanner(System.in);
        inputString = input.next();

        UsernamePasswd main = new UsernamePasswd("admin","root");
        if (inputString.equals(main.getUserID())){
            System.out.println("���������룺");
            Scanner input1 = new Scanner(System.in);
            inputString1 = input1.next();
            if (inputString1.equals(main.getPasswd())){
                System.out.println("��½�ɹ�����ӭ����������");
            }else {System.out.println("�����������");}
        }else {System.out.println("�û����������");}
    }
}
