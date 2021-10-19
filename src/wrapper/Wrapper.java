package wrapper;
//Java包装类、装箱和拆箱
public class Wrapper {
    public static void main(String[]args){
        int number = 500;
        Integer number2 = number;
        int number3 = number2;
        System.out.println(number3);

        Integer number4 = 500;
        System.out.println(number2.equals(number4));

        Integer number5 = number;
        System.out.println(number2.equals(number5));

        int number6 = 600;
        Integer number7 = new Integer(number6);
        int number8 = number7.intValue();
        System.out.println(number8);




    }
}
