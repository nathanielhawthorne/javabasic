package wrapper.userregister;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("------------�û�ע��--------------");
        System.out.println("�û�����");
        String username = input.next();
        System.out.println("���룺");
        String pwd = input.next();
        System.out.println("���䣺");
        String age = input.next();
        boolean con = Register.validateUser(username,pwd,age);
        if (con) {
            System.out.println("ע��ɹ���");
        } else {
            System.out.println("ע��ʧ�ܣ�");
        }
    }
}