package javadateformat;

import java.util.Date;

//Java计算课程结束的日期
/*
假设，每周曰到周六为整的一周，每周从周日开始算起。
其中每周的周一、周二、周五需要去学校上课，总共再上9天本学期就结束了。
编写 Java 程序，计算上完 9 次课后的日期及星期，以及从当天起到本学期结束总共需要度过的天数。
具体的程序代码如下：
 */
public class course {
    public static void main(String[]args){
        Date startDate = new Date();
        startDate.getTime();
        System.out.println(startDate);
    }
}
