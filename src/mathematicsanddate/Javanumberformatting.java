package mathematicsanddate;

import java.text.DecimalFormat;
import java.util.Scanner;

//Java���ָ�ʽ��
public class Javanumberformatting {
    public static void main(String[]args){
        DecimalFormat df1 = new DecimalFormat("0.0");
        DecimalFormat df2 = new DecimalFormat("#.#");
        DecimalFormat df3 = new DecimalFormat("0000.0000");
        DecimalFormat df4 = new DecimalFormat("####.####");
        System.out.println("������һ�����֣�");
        Scanner input = new Scanner(System.in);
        double d = input.nextDouble();
        System.out.println("0.0��ʽ��"+df1.format(d));
        System.out.println("#.#��ʽ��"+df2.format(d));
        System.out.println("0000.0000��ʽ��"+df3.format(d));
        System.out.println("####.####��ʽ��"+df4.format(d));
    }
}
