package Break;

import java.util.Scanner;

public class Run {
    public static void main(String[]args){
        String answer;
        for (int circle = 1;circle <= 10;circle++){
            System.out.println("当你跑完第"+circle+"圈时，教练问你顶不顶得住，你的回答是(yes or no)：");
            Scanner input = new Scanner(System.in);
            answer = input.next();
            if (answer.equals("yes")){
                System.out.println("很好，继续！");
            }else if (answer.equals("no")){
                System.out.println("好吧！到此为止!辣鸡");
                break;
            }

        }
    }
}
