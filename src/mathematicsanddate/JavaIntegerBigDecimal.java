package mathematicsanddate;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

//Java���������㣨BigInteger���BigDecimal�ࣩ
public class JavaIntegerBigDecimal {
    public static void main(String[]args){
        int number;
        System.out.print("������һ�����֣�");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        BigInteger bi = new BigInteger(number+"");
        System.out.println(bi.add(new BigInteger("99")));
        System.out.println(bi.multiply(new BigInteger("99")));
        System.out.println(bi.subtract(new BigInteger("10")));
        System.out.println(bi.divide(new BigInteger("100")));
        System.out.println(bi.remainder(new BigInteger("100")));
        System.out.println(bi.pow(3));
        System.out.println(bi.divideAndRemainder(new BigInteger("10")));
        System.out.println(bi.min(new BigInteger("10")));
        System.out.println(bi.max(new BigInteger("100")));
        System.out.println("--------------------------------------------------");
        double doubleNumber;
        System.out.println("������һ��double����");
        Scanner douleInput = new Scanner(System.in);
        doubleNumber = douleInput.nextDouble();
        BigDecimal bd = new BigDecimal(doubleNumber+"");
        System.out.println(bd.divide(new BigDecimal(10)));
        System.out.println(bd.multiply(new BigDecimal(100)));
        System.out.println(bd.divide(new BigDecimal(10)));
    }
}
