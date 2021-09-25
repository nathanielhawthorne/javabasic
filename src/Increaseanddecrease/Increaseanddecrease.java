package Increaseanddecrease;

public class Increaseanddecrease {
    static int number1 = 1;
    static int number3;
    static float number5 = 1.2f;
    static float number6;
    static char char1 = 'B';
    static char char2;
    public static void main(String[]args){
        System.out.println("整数自增自减");
        number3 = number1++;
        System.out.println("number1="+number1);
        System.out.println("number3="+number3);
        System.out.println("------------------------------------------");
        number3 = ++number1;
        System.out.println("number1="+number1);
        System.out.println("number3="+number3);
        System.out.println("------------------------------------------");
        number3 = number1--;
        System.out.println("number1="+number1);
        System.out.println("number3="+number3);
        System.out.println("------------------------------------------");
        number3 = --number1;
        System.out.println("number1="+number1);
        System.out.println("number3="+number3);

        System.out.println("小数自增自减");

        number6 = number5++;
        System.out.println("number5="+number5);
        System.out.println("number6="+number6);
        System.out.println("------------------------------------------");
        number6 = ++number5;
        System.out.println("number5="+number6);
        System.out.println("number5="+number6);
        System.out.println("------------------------------------------");
        number6 = number5--;
        System.out.println("number5="+number5);
        System.out.println("number6="+number6);
        System.out.println("------------------------------------------");
        number6 = --number5;
        System.out.println("number5="+number5);
        System.out.println("number6="+number6);

        System.out.println("字符自增自减");

        char2 = char1++;
        System.out.println("char1="+char1);
        System.out.println("char2="+char2);
        System.out.println("------------------------------------------");
        char2 = ++char1;
        System.out.println("char1="+char1);
        System.out.println("char2="+char2);
        System.out.println("------------------------------------------");
        char2 = char1--;
        System.out.println("char1="+char1);
        System.out.println("char2="+char2);
        System.out.println("------------------------------------------");
        char2 = --char1;
        System.out.println("char1="+char1);
        System.out.println("char2="+char2);
        System.out.println("------------------------------------------");
    }
}
