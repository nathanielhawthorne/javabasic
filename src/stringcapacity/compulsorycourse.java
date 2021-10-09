package stringcapacity;

import java.util.Scanner;

//每个新学期开始，学校都会针对本学期课程列出必修课程。
// 编写一个 Java 程序，要求用户向控制台循环录入五门必修课程名称，并将这五个名称进行连接，最后输出连接后的字符串。
// 代码如下：
public class compulsorycourse {

    public static void main(String[]args){
        String className;//定义一门必修课程名字
        StringBuffer courseName = new StringBuffer();//定义一个StringBuffer变量
        for (int n = 1;n<6;n++){//输入五次课程名字
            System.out.println("请输入第"+n+"门课程名字：");
            Scanner input = new Scanner(System.in);
            className = input.next();
            courseName.append(className+"\t");//将每一次遍历的结果加起来

        }


        System.out.println(courseName);



    }
}
