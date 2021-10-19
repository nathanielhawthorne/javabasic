package datecheck;

import java.util.Calendar;
import java.util.Scanner;

//判断平年闰年
public class program1 {
    public static void main(String[]args){
        Calendar calendar = Calendar.getInstance();
        System.out.println("请输入你要查询的年分：");
        Scanner input = new Scanner(System.in);
        int yearInput = input.nextInt();
        calendar.set(Calendar.YEAR,yearInput);
        int output = calendar.get(Calendar.YEAR);
        System.out.println(output);
        //判断平闰年的标准
        /*
        if (output){

        }else{}
        System.out.println("你要查询的年份为");
*/
    }
}
