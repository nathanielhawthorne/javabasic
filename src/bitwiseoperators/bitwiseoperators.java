package bitwiseoperators;

public class bitwiseoperators {
    static int number1 = 1;
    static int number2 = 2;
    public static void main(String[]args){
        number2 -= number1;
        System.out.println("number2="+number2);
        number2 &= number1;
        System.out.println("number2="+number2);
        number2 |= number1;
        System.out.println("number2="+number2);
        number2 ^= number1;
        System.out.println("number2="+number2);
    }
}
