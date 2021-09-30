package YanghuiTriangle;

import java.util.Scanner;

//杨辉三角，未完成...........
public class YanghuiTriangle {
    static int totalline;
    static int number;
    public static void main(String[]args){
        System.out.println("请输入要打印的行数：");
        Scanner input =new Scanner(System.in);
        totalline = input.nextInt();
        for (int linenumber = 1;linenumber<=totalline;linenumber++){
            if (linenumber == 1){
                System.out.print("1");
            }else if(linenumber >= 3)
            {
                if (linenumber - number == 2) {
                    System.out.print("1" + "\t" + (linenumber - 1) + "\t" + (linenumber - 1) + "\t" + "1");
                }
            }
        }

    }
}
