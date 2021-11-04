package classandobject.practise.mytime;
/*
11 .类的成员变量与方法、构造方法 在程序中经常要对时间进行操作但是并没有时间类型的数据。
那么我们可以自己实现一个时间类来满足程序中的需要。定义名为MyTime的类,其中应有三个整型成员,时 hour、分minute、
秒second，为了保证数据的安全性，这三个成员变量应声明为私有。为MyTime类定义构造方法以方便创建对象时初始化成员变量。
再定义diaplay方法用于将时间信息打印出来。 为MyTime类添加以下方法： addSecond(int sec)、 addMinute(int min)、
 addHour(int hou) 、subSecond(int sec) 、subMinute(int min)、 subHour(int hou)，
 分别对时、分、秒进行加减运算。 并为该类重载一组构造方法 ，以方便使用者能够以多种形式初始化该类的实例。
-----------------------------------
java面向对象练习题
https://blog.51cto.com/u_15054039/3543932
 */
public class MyTime {
    private double hour;
    private double minute;
    private double second;

    public MyTime(double hour,double minute,double second){
        this.hour = hour;
        this.minute = minute;
        this.second =second;

    }
    public void printInfo(){
        System.out.println(hour+"点"+minute+"分"+second+"秒");
    }
    public void addSecond(int sec){
        second +=sec;
        System.out.println("增加了"+sec+"秒后的时间");
    }
    public void addMinute(int min){
        minute +=min;
        System.out.println("增加了"+min+"分钟后的时间");
    }
    public void addHour(int h){
        hour +=h;
        System.out.println("增加了"+h+"小时后的时间");
    }

}
