package LogicalOperators;

public class and {
    static int number1 = 2;
    static int number2 = 3;
    static boolean number3 = number1>0&number2<0;
    static boolean number4 = number1>0&&number2<0;
    public static void main(String[]args){
        if(number1<0&number2++>5){
            System.out.println(number2);
        }
    }
}
