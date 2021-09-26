package Break;

import java.util.Arrays;
import java.util.Scanner;

public class Score {
    public static void main(String[]args){
        double mount = 0;

        for (int number = 0;number<=5;number++){
            String [] str = {"语文","数学","英语","物理","化学","生物"};
            String str2[] = Arrays.copyOfRange(str, number, number+1);// 截取number对应的学科
            String object = Arrays.toString(str2);
            System.out.println("请输入"+object+"的分数");
            Scanner input = new Scanner(System.in);
            double score = input.nextDouble();
            while(score<0||score>100){
                System.out.println("输入有误！请重新输入");
                Scanner input1 = new Scanner(System.in);
                double score1 = input1.nextDouble();
                score = score1;
            }
            mount += score;

        }
        System.out.println("你的总分是"+mount);
    }
}
