package mathematicsanddate;

import java.text.DecimalFormat;
import java.util.Scanner;

//Java数字格式化
public class Javanumberformatting {
    public static void main(String[]args){
        DecimalFormat df1 = new DecimalFormat("0.0");
        DecimalFormat df2 = new DecimalFormat("#.#");
        DecimalFormat df3 = new DecimalFormat("0000.0000");
        DecimalFormat df4 = new DecimalFormat("####.####");
        System.out.println("请输入一个数字：");
        Scanner input = new Scanner(System.in);
        double d = input.nextDouble();
        System.out.println("0.0格式："+df1.format(d));
        System.out.println("#.#格式："+df2.format(d));
        System.out.println("0000.0000格式："+df3.format(d));
        System.out.println("####.####格式："+df4.format(d));
    }
}
