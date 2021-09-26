package javafor;

public class factorial {
    public static void main(String[]args){
        int result = 1;
        for (int number=1;number<=10;number++){
            result *= number;
        }
        System.out.println("10µÄ½×³ËÎª"+result);
    }
}
