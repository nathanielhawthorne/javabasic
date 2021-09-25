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
        System.out.println("请输入用户名：");
        Scanner input1 =new Scanner(System.in);
        userinput = input1.next();
        System.out.println("----------------------------------------------");
        System.out.println("请输入密码：");
        Scanner input2 = new Scanner(System.in);
        passwordinput = input2.next();
        System.out.println("----------------------------------------------");
        System.out.println("请输入验证码：");
        Scanner input3 = new Scanner(System.in);
        verifycodeinput = input3.nextInt();
        if (userinput != user&&passwordinput!=password&&verifycodeinput!=verifycode){
            System.out.println("请检查输入信息是否正确！");
            System.out.println("请重新输入信息：");
        }else {
            System.out.println("登陆成功，欢迎回来！");
        }
    }
}
