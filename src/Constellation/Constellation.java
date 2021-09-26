package Constellation;

import java.util.Scanner;

public class Constellation {
    //Java项目实战：根据出生日期计算（判断）星座
    static long day;
    static String birthday = "xx月xx号";
    public static void main(String[]args){
        System.out.println("请输入你的生日（阳历xx月xx号）");
        Scanner input1 = new Scanner(System.in);
        birthday = input1.next();
        String str1 = birthday.substring(0,2);
        String str2 = birthday.substring(3,5);
        long number1 = Long.valueOf(str1).longValue();
        //输入的是字符串，但是要把它转换为整形便于下面的范围选择，格式必须统一，不然不知道将那些字符串转换为整形
        //这样最方便，如果要根据月份和号数的位数来，程序将变得复杂
        long number2 = Long.valueOf(str2).longValue();
        day = number2;
        String str3 = birthday.substring(2,3);
        String str4 = birthday.substring(birthday.length()-1);
        //求字符串最后一位值
        int length = birthday.length();
        if (number1>=1L&&number1<=12L&&number2>=1L&&number2<=31L&&str3.equals("月")&&str4.equals("号")&&length==6){
            if (str1.equals("01")&&day>=21&&day<=31){
                System.out.println("你是水瓶座");
            }else if (str1.equals("02")&&day>=1&&day<=19){
                System.out.println("你是水瓶座");
            }else if (str1.equals("02")&&day>=20&&day<=29){
                System.out.println("你是双鱼座");
            }else if (str1.equals("03")&&day>=1&&day<=20){
                System.out.println("你是双鱼座");
            }else if (str1.equals("03")&&day>=21&&day<=31){
                System.out.println("你是白羊座");
            }else if (str1.equals("04")&&day>=1&&day<=20){
                System.out.println("你是白羊座");
            }else if (str1.equals("04")&&day>=21&&day<=30){
                System.out.println("你是金牛座");
            }else if (str1.equals("05")&&day>=1&&day<=21){
                System.out.println("你是金牛座");
            }else if (str1.equals("05")&&day>=22&&day<=31){
                System.out.println("你是双子座");
            }else if (str1.equals("06")&&day>=1&&day<=21){
                System.out.println("你是双子座");
            }else if (str1.equals("06")&&day>=22&&day<=30){
                System.out.println("你是巨蟹座");
            }else if (str1.equals("07")&&day>=1&&day<=23){
                System.out.println("你是巨蟹座");
            }else if (str1.equals("07")&&day>=24&&day<=31){
                System.out.println("你是狮子座");
            }else if (str1.equals("08")&&day>=1&&day<=23){
                System.out.println("你是狮子座");
            }else if (str1.equals("08")&&day>=24&&day<=31){
                System.out.println("你是处女座");
            }else if (str1.equals("09")&&day>=1&&day<=23){
                System.out.println("你是处女座");
            }else if (str1.equals("09")&&day>=24&&day<=30){
                System.out.println("你是天秤座");
            }else if (str1.equals("10")&&day>=1&&day<=23){
                System.out.println("你是天秤座");
            }else if (str1.equals("10")&&day>=24&&day<=31){
                System.out.println("你是天蝎座");
            }else if (str1.equals("11")&&day>=1&&day<=22){
                System.out.println("你是天蝎座");
            }else if (str1.equals("11")&&day>=23&&day<=30){
                System.out.println("你是射手座");
            }else if (str1.equals("12")&&day>=1&&day<=22){
                System.out.println("你是射手座");
            }else if (str1.equals("12")&&day>=23&&day<=31){
                System.out.println("你是摩羯座");
            }else {
                System.out.println("你是摩羯座");
            }
        }else {
            System.out.println("你输入的格式有误，请检查以后再输入！");
        }

    }
}
