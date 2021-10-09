package regexphonenumber;



import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
在注册会员时，经常需要输入电话号码，电话号码是指手机号码或者固定电话。
如果输入的内容不合法，则会向用户输出提示。
本实例模拟实现电话号码的验证功能，接收用户在控制台输入的电话号码，然后进行判断，并将结果输出。

 */
public class PhoneNumberVerify {
    public static void main(String[]args){
        String regex = "0\\d{2,3}[-]?\\d{7,8}|" +
                "0\\d{2,3}\\s?\\d{7,8}|13[0-9]\\d{8}|15[1089]\\d{8}";
        //声明一个正则表达式用于匹配电话号码
        String phoneNumber;//声明一个字符串，用于存储输入的内容
        String input2 = "y";

        do {
            System.out.println("请输入你的电话号码：");
            Scanner input = new Scanner(System.in);
            phoneNumber = input.next();
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(phoneNumber);
            boolean bool = m.matches();
            if (bool){
                System.out.println("输入电话号码正确，号码录入成功！");
            }else {
                System.out.println("号码输入错误，请重新输入：");

            }
            System.out.println("输入y/n继续：");
            input2 = input.next();
        }while(input2.equalsIgnoreCase("y"));
    }
}
