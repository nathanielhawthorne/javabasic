package stringcapacity;

import java.util.Scanner;

//Java StringBuffer替换特殊字符
/*
在本实例中为保证学生输入的 Java 文件名合格，
将利用 StringBuffer 类实现对 Java 文件名中的特殊符号进行替换，
包括将中文状态下的“。”和全角状态下的“.”替换为英文状态下的“.”。
 */
public class replacespecialcharacters {
    public static void main(String[]args){
        StringBuffer fileName = new StringBuffer("");//定义java文件名
        StringBuffer result = new StringBuffer("");
        String inputFileName;//定义输入的java文件名
        System.out.println("请输入java文件名：");
        Scanner input = new Scanner(System.in);
        inputFileName = input.next();
        char[] arrayInputFileName = inputFileName.toCharArray();//将输入的字符串转化为数组
        for (int number = 0;number<inputFileName.length();number++){//遍历输入的字符串
            //System.out.println(arrayInputFileName[number]);//打印遍历出来的每一个数
            String  stringArrayInputFileName = Character.toString(arrayInputFileName[number]);
            //将遍历出来的每一个数转化为字符
            if (stringArrayInputFileName.equals("。")){//找出输入的字符里面等已中文句号的
                StringBuffer stringBufferInputName = new StringBuffer(stringArrayInputFileName);
                //新建一个StringBuffer变量，用于存储等于“。”的字符
                stringBufferInputName.replace(0,1,".");//替换等于.的字符
                //System.out.println(stringBufferInputName);
                stringArrayInputFileName = stringBufferInputName.toString();

            }
            System.out.print(stringArrayInputFileName);

        }



    }
}
