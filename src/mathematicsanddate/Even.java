package mathematicsanddate;

import java.util.Random;

//下面使用 random() 方法实现随机生成一个 2~100 偶数的功能。具体代码如下：
public class Even {
    public static void main(String[]args){
        Random r = new Random();//随机生成[0,1)的小数
        int number = r.nextInt(100)+1;//随机生成[1,101)的整数
        if (number%2==0){
            System.out.println(number);
        }else {
            System.out.println(number+1);
        }
    }
}
