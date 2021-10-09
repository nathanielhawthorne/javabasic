package StringEquals;

import java.util.Scanner;

//登录会员系统，输入用户名密码，区分大小写
public class VIPUserPasswd {
    static String user = "admin";
    static String passwd = "root";
    static String userinput;
    static String passwdinput;
    static String code;
    static String key;
    static String keyboard= "`,1,2,3,4,5,6,7,8,9,0,-,=,q,w,e,r,t,y,u,i,o,p,[,],a,s,d,f,g,h,j,k,l,;,',z,x,c,v,b,n,m,,,.,/";
    static String Spilt[] = keyboard.split(",");
    public static void main(String[]args){
        System.out.println("***************************************");
        System.out.println("***                                 ***");
        System.out.println("***              尊敬的客户你好       ***");
        System.out.println("***             欢迎来到浦东洗脚城     ***");
        System.out.println("***                                 ***");
        System.out.println("***************************************");
        System.out.println("按任意键继续！");
        Scanner input1 = new Scanner(System.in);
        code = input1.next();
        for (int number = 0;number<44;number++){
            //System.out.println(Spilt[number]);
            if (code.equalsIgnoreCase(Spilt[number])){
                System.out.println("请继续！");
                break;
            }
        }
        System.out.println("请输入你的用户名：");
        Scanner input = new Scanner(System.in);
        userinput = input.next();
        System.out.println("请输入你的密码：");
        Scanner input2 = new Scanner(System.in);
        passwdinput = input1.next();
        if (userinput.equalsIgnoreCase(user)&&passwdinput.equalsIgnoreCase(passwd)){
            System.out.println("欢迎回来！熊总！");
        }else {
            System.out.println("请检查用户名密码后再次输入！\n请输入你的用户名：");
            do {
                //System.out.println("请输入你的用户名：");
                Scanner input3 = new Scanner(System.in);
                userinput = input3.next();
                System.out.println("请输入你的密码：");
                Scanner input4 = new Scanner(System.in);
                passwdinput = input4.next();
            } while (!userinput.equalsIgnoreCase(user)&&!passwdinput.equalsIgnoreCase(passwd));
            System.out.println("欢迎回来！熊总！");
        }
    }
}
