package javatimeanddate;

import java.util.Date;
import java.util.Scanner;

/*
下面使用一个实例来具体演示 Date 类的使用。
假设，某一天特定时间要去做一件事，而且那个时间已经过去一分钟之后才想起来这件事还没有办，
这时系统将会提示已经过去了多 长时间。具体的代码如下：
 */
public class beforeafter {
    public static void main(String[]args){
        String something;
        System.out.println("输入你要做的事：");
        Scanner input = new Scanner(System.in);
        something = input.next();
        Date sthDate = new Date();
        try {
            Thread.sleep(60000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        Date doDate = new Date();
        System.out.println("这件事已经过去了"+(doDate.getTime()-sthDate.getTime())/1000+"秒");
    }
}
