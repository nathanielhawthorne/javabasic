package javafor;

public class TheSecondExpressionIsEmpty {
    public static void main(String[]args){
        int result = 0;
        for (int number = 1;;number++){

            if (number>100)
                break;
            if (number%2==1)
                result += number;

        }
        System.out.println("1-100的奇数和为："+result);

    }
}
