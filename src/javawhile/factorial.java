package javawhile;

public class factorial {

    public static void main(String[]args){
        int number2 = 1;
        int summary = 1;
        while (number2<=10){
            //��ֹ��ֵ�����ʹ�׳�Ϊ0
            summary *= number2;
            number2++;

        }
        System.out.println(summary);
    }
}
