package array;

import java.util.Scanner;

public class JavaArray {
    public static void main(String[]args){
        String[] score = new String[10];
        int[] number;
        number = new int[5];
        int[] number1 = new int[5];
        number1[0] = 1;
        number1[1] = 2;
        number1[2] = 3;
        number1[3] = 4;
        number1[4] = 5;
        /*
        如果程序员只指定了数组的长度，那么系统将负责为这些数组元素分配初始值。指定初始值时，系统按如下规则分配初始值。

        数组元素的类型是基本类型中的整数类型（byte、short、int 和 long），则数组元素的值是 0。
        数组元素的类型是基本类型中的浮点类型（float、double），则数组元素的值是 0.0。
        数组元素的类型是基本类型中的字符类型（char），则数组元素的值是‘\u0000’。
        数组元素的类型是基本类型中的布尔类型（boolean），则数组元素的值是 false。
        数组元素的类型是引用类型（类、接口和数组），则数组元素的值是 null。

         */
        int[] number2 = new int[5];
        number2[0] = 1;
        int[] number3 = {1,2,3,4,5};
        //System.out.println(number3[5]);
        Scanner input = new Scanner(System.in);
        for (int n = 0;n<number.length;n++){
            System.out.println("请输入第"+(n+1)+"次数据");
            number[n] = input.nextInt();
        }
        System.out.println("第三次的数据是"+number[2]);

        int[] number4 = {1,2,3,4,5};
        for (int val : number4){
            System.out.print(val+"\t");
        }


    }
}
