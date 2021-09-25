package switchcase;

import java.util.Scanner;

public class switchNested {
    static int number1;
    static int number2;
    static int number3;
    public static void main(String[]args){
        System.out.println("猜密码游戏！");
        System.out.println("游戏规则，输入密码，密码总共六位，只有一次机会，输错一个数字即宣告失败");
        System.out.println("第一个数字：");
        Scanner input1 = new Scanner(System.in);
        number1 = input1.nextInt();
        switch (number1){
            case 1:
                System.out.println("数字正确");
                System.out.println("第二个数：");
                Scanner input2 = new Scanner(System.in);
                number2 = input2.nextInt();
                switch (number2){
                    case 2:
                        System.out.println("数字正确");
                    case 4:
                        System.out.println("数字错误！");
                        System.out.println("请输入最后一个数字：");
                        Scanner input3 =new Scanner(System.in);
                        number3 = input3.nextInt();
                        switch (number3){
                            case 3:
                                System.out.println("密码输入正确！");
                                break;
                            case 1:
                                System.out.println("输入错误");
                        }
                        break;

                    case 3:
                        System.out.println("很接近了，加油！");
                }
                break;
            case 2:
                System.out.println("输入错误，请重新输入：");
        }
    }
}
