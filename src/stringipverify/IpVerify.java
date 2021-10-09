package stringipverify;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Java使用正则表达式验证IP地址
 */
public class IpVerify {
    public static void main(String[]args){
        String ipAddress;//定义一个变量用于存储ip地址
        String answer;//定义一个变量用于存储是否继续录入结果的答案
        String regex = "[0123456789]\\.[0123456789]\\.[0123456789]\\.[0123456789]|[0123456789][0123456789]\\.[0123456789][0123456789]\\.[0123456789][0123456789]\\.[0123456789][0123456789]|[12][012345][012345]\\.[12][012345][012345]\\.[12][012345][012345]\\.[12][012345][012345]";
        //定义一个regex变量用于匹配ip地址，分别匹配一位数的ip，两位数的ip，三位数的ip，因为排列组合太多，只列这三种
        do {
            System.out.println("请输入ip地址：");
            Scanner input = new Scanner(System.in);
            ipAddress = input.next();
            Pattern p = Pattern.compile(regex);//定义一个pattern用于存储正则表达式
            Matcher m = p.matcher(ipAddress);//定义一个地址用于和以上匹配
            boolean bool = m.matches();//返回匹配结果
            if (bool){
                System.out.println("ip地址录入成功！");
            }else {
                System.out.println("输入格式有问题，请重新输入！");
            }
            System.out.println("还要继续吗?y/n");
            answer = input.next();
        }while(answer.equalsIgnoreCase("y"));
    }
}
