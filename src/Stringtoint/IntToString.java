package Stringtoint;

public class IntToString {
    static int number = 123;
    static String str;
    public static void main(String[]args){
        str = String.valueOf(number);
        System.out.println(number);
        System.out.println("--------------------------------------");
        str = Integer.toString(number);
        System.out.println(number);
        System.out.println("--------------------------------------");
        str = ""+number;
        System.out.println(number);
    }
}
