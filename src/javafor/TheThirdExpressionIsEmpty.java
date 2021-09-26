package javafor;

public class TheThirdExpressionIsEmpty {
    public static void main(String[]args){
        int result = 0;
        for (int number =1;number<=100;){
            if (number%2==1)
                result += number;
            number++;
        }
        System.out.println("1-100的奇数和为："+result);
    }
}
