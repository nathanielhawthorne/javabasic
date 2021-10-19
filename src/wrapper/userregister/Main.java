package wrapper.userregister;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("------------用户注册--------------");
        System.out.println("用户名：");
        String username = input.next();
        System.out.println("密码：");
        String pwd = input.next();
        System.out.println("年龄：");
        String age = input.next();
        boolean con = Register.validateUser(username,pwd,age);
        if (con) {
            System.out.println("注册成功！");
        } else {
            System.out.println("注册失败！");
        }
    }
}