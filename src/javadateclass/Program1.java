package javadateclass;

import java.util.Date;

//太他妈难了，日期类，感觉到瓶颈了
public class Program1 {
    public static void main(String[]args){
        Date date = new Date();
        //System.out.println(date.toString());
        System.out.println(date);
        try {
            Thread.sleep(60000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        Date date2 = new Date();
        System.out.println("现在的时间是："+date2);
        System.out.println("这件事已经过去了"+(date2.getTime()-date.getTime())/1000+"秒");


        Date date3 = new Date(2021,10,12);
        Date date4 = new Date(2021,10,13);
        int n = date3.compareTo(date4);

        if (date3.before(date4)){
            System.out.println("true");
        }else if (date3.after(date4)){
            System.out.println("false");
        }else if (date3.equals(date4)){
            System.out.println("这两个日期一样的");
        }
        System.out.println(date3.getTime());
        System.out.println(date4.toString());
        System.out.println(n);
    }
}
