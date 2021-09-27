package JudgingTheAverageLeapYear;

import java.util.Scanner;

/*
判断闰年平年并输出某月的天数

    西元年份除以4不可整除，為平年。
    西元年份除以100可整除，且除以400不可整除，為平年
    西元年份除以4可整除，且除以100不可整除，為閏年。
    西元年份除以400可整除，為閏年。

    阳历平年365(1-12月分别为31天，28天，31天，30天，31天，30天，31天，31天，30天，31天，30天，31天)。
    闰年1-12月分别为31天，29天，31天，30天，31天，30天，31天，31天，30天，31天，30天，31天，
    其中闰年2月份由平年的28天变为29天，闰年共有366天。


 */
public class JudgingTheAverageLeapYear {
    static int year;
    static int month;
    static String str;
    public static void main(String[]args){
        System.out.println("**************************");
        System.out.println("*                        *");
        System.out.println("* 欢迎来到平闰年月份查询系统！*");
        System.out.println("*                        *");
        System.out.println("**************************");
        System.out.println("按q继续！");
        Scanner input = new Scanner(System.in);
        str = input.next();
        while (!str.equals("q")){
            System.out.println("输入错误！请按q继续！");
            Scanner input4 = new Scanner(System.in);
            String str1 = input4.next();
            str = str1;
        }


        System.out.println("请输入你要查询的年份：");
        Scanner input1 = new Scanner(System.in);
        year = input1.nextInt();
            if (year % 4 != 0 ||( year % 100 == 0 && year % 400 != 0)) {
                System.out.println(year+"年是平年");
                System.out.println("请输入你要查询的月份");
                Scanner input2 = new Scanner(System.in);
                month = input2.nextInt();
                if (month==1||month==3||month==5||month==7||month==8||month==10||month==12){
                    System.out.println(year+"年"+month+"月共有31天");
                }else if(month==4||month==6||month==9||month==11){
                    System.out.println(year+"年"+month+"月共有30天");
                }else if(month==2){
                    System.out.println(year+"年"+month+"月共有28天");
                }

            }
            if ((year % 4 == 0 && year % 100 != 0 )|| year % 400 == 0) {
                System.out.println(year+"年是闰年");
                System.out.println("请输入你要查询的月份");
                Scanner input2 = new Scanner(System.in);
                month = input2.nextInt();
                if (month==1||month==3||month==5||month==7||month==8||month==10||month==12){
                    System.out.println(year+"年"+month+"月共有31天");
                }else if(month==4||month==6||month==9||month==11){
                    System.out.println(year+"年"+month+"月共有30天");
                }else if(month==2){
                    System.out.println(year+"年"+month+"月共有29天");
                }
            }

    }
}
