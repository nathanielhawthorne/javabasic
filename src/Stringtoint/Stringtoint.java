package Stringtoint;

public class Stringtoint {
    static String str = "123451";
    static int number;
    public static void main(String[]args){
        number = Integer.parseInt(str);
        System.out.println(number);
        System.out.println("---------------------------------------------------");
        number = Integer.valueOf(str).intValue();
        System.out.println(number);
    }
}
