package StringEquals;

import java.util.Scanner;

//输入密码并确认密码
public class StringEquals {
    static String passwdFirst;
    static String passwdSecond;
    public static void main(String[]args){
        System.out.println("***************************************");
        System.out.println("***                                 ***");
        System.out.println("***             登录界面              ***");
        System.out.println("***                                 ***");
        System.out.println("***************************************");
        System.out.println("请输入你的密码：");
        Scanner input = new Scanner(System.in);
        passwdFirst = input.next();
        System.out.println("请再次输入你的密码：");
        Scanner input1 = new Scanner(System.in);
        passwdSecond = input1.next();
        if (passwdFirst.equals(passwdSecond)){
            System.out.println("密码录入成功！你的密码是："+passwdFirst);
        }else {
            System.out.println("第二次密码与第一次密码不吻合，请重新输入：");
            do {
                //System.out.println("请输入你的密码：");
                Scanner input2 = new Scanner(System.in);
                passwdFirst = input2.next();
                System.out.println("请再次输入你的密码：");
                Scanner input3 = new Scanner(System.in);
                passwdSecond = input3.next();
            } while (!passwdFirst.equals(passwdSecond));
            System.out.println("密码录入成功！你的密码是：" + passwdFirst);
        }
    }
}
