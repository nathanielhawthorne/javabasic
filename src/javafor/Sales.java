package javafor;

import java.util.Scanner;
//编写一个 Java 程序，统计某超市上半年的总销售量，要求由用户输入每月的销量。
public class Sales {
    static int mountOfMonth;
    static int mount;
    public static void main(String[]args){
        for (int number = 1;number<=6;number++) {
            System.out.println("请输入"+number+"月的销售量：");
            Scanner input1 = new Scanner(System.in);
            mountOfMonth = input1.nextInt();
            mount += mountOfMonth;
        }
        System.out.println("上半年总销售量为："+mount);
    }
}
