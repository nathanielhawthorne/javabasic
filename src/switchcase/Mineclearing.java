package switchcase;

import java.util.Scanner;

public class Mineclearing {
    static String start;
    static int number;
    public static void main(String[]args){
        System.out.println("这是一个扫雷游戏，雷场长9，宽9，长和宽都是1-9的整数，每次输入一个数字代表一个方格，比如23代表第二列第三排，请输入q开始游戏：");
        Scanner input = new Scanner(System.in);
        start = input.next();
        if (start.equals("q")) {
            System.out.println("游戏开始！");
            System.out.println("请输入雷场坐标xy（x代表列，y代表行，共九列九行）：");
            Scanner input2 = new Scanner(System.in);
            number = input2.nextInt();
            int number1 = number%2;
            switch (number1) {
                case 1:
                    System.out.println("你踩到雷了！");
                    break;
                case 0:
                    System.out.println("哈哈，好险，没踩到！");
                    break;
            }
        }else {
            System.out.println("请按q开始游戏!！");
        }
    }
}
