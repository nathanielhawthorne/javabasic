package airticket;

import java.util.Scanner;

public class ticket {
    //Java项目实战：实现淡旺季飞机票打折，这是一个淡旺季机票查询系统，
    //淡季
    static double fare1 = 1000;
    static int fare2;
    static String stationstart;
    static String stationend;
    static String season1 = "Off season";
    static String season2 = "Peak season";
    static int month;
    public static void main(String[]args){
        System.out.println("请输入出发站（只有上海）：");
        Scanner input1 = new Scanner(System.in);
        stationstart = input1.next();
        System.out.println("请输入到达站（宁波、杭州）：");
        Scanner input2 = new Scanner(System.in);
        stationend = input2.next();
        System.out.println("请输入要出发的月份：");
        Scanner input3 = new Scanner(System.in);
        month = input3.nextInt();
        if (month>=3&&month<=6&&month>=10&&month<=12){
            if (stationstart.equals("上海")&&stationend.equals("宁波")){
                double farediscount = 0.65*fare1;
                System.out.println("现在是旺季，机票打六五折，机票价格为："+farediscount);
            }else if (stationstart.equals("上海")&&stationend.equals("杭州")){
                double farediscount = 0.75*fare1;
                System.out.println("现在是旺季，机票打七五折，机票价格为："+farediscount);
            }

        }else {
            if (stationstart.equals("上海")&&stationend.equals("宁波")){
                double farediscount = 0.35*fare1;
                System.out.println("现在是旺季，机票打三五折，机票价格为："+farediscount);
            }else if (stationstart.equals("上海")&&stationend.equals("杭州")){
                double farediscount = 0.45*fare1;
                System.out.println("现在是淡季，机票打四五折，机票价格为："+farediscount);
            }
        }

    }
}
