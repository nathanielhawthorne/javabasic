package javadateformat;

import java.text.SimpleDateFormat;
import java.util.Date;

//Java日期格式化（DateFormat类和SimpleDateFormat类）
public class JavaDateFormat {
    public static void main(String[]args){
        Date date = new Date();
        SimpleDateFormat f = new SimpleDateFormat("" +
                "今天是"+"yyyy年MM月dd日E， HH点mm分ss秒SSS毫秒，今年的第D天，" +
                "这个月的第dd天");
        System.out.println(f.format(date));
    }
}
