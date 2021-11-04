package classandobject.practise.usernamepasswd;

import java.util.Scanner;

public class Main {
    static String inputString;
    static String inputString1;
    public static void main(String[]args){
        System.out.println("输入用户名：");
        Scanner input = new Scanner(System.in);
        inputString = input.next();

        UsernamePasswd main = new UsernamePasswd("admin","root");
        if (inputString.equals(main.getUserID())){
            System.out.println("请输入密码：");
            Scanner input1 = new Scanner(System.in);
            inputString1 = input1.next();
            if (inputString1.equals(main.getPasswd())){
                System.out.println("登陆成功。欢迎回来。富豪");
            }else {System.out.println("密码输入错误");}
        }else {System.out.println("用户名输入错误。");}
    }
}
