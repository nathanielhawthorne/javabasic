package javafor;

public class TheFirstExpressionIsEmpty {
    public static void main(String[]args){
        int number = 1;
        int result = 0;
        for (;number<=100;number++){
            if (number%2==0)
                result += number;
        }
        System.out.println("1-100的偶数和为："+result);
    }
}
