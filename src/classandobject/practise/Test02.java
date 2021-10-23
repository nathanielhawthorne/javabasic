package classandobject.practise;

public class Test02 {
    public static int count = 1;
    /*
    public static int method(){
        count+=1;
        System.out.println(count);
        return count;
    }

     */
    //创建一个非静态代码块，非静态代码块是在创建对象时自动执行的代码，不创建对象不执行该类的非静态代码块，
    // 代码域中定义的变量都是局部的，只有域中的代码可以调用。

    {
        count+=1;
        System.out.println(count);
    }
    //创建两个静态代码块
    /*
    如果类中包含多个静态代码块，则 Java 虚拟机将按它们在类中出现的顺序依次执行它们，每个静态代码块只会被执行一次。
     */

    /**
     *
     * @author:
     * @description:
     */
    static {
        count-=10;
        System.out.println(count);
    }
    static {
        count+=5;
        System.out.println(count);
    }
    public static void main(String[]args){
        System.out.println();
        System.out.println("实例化一个类，输出：");
        Test02 test02 = new Test02();
        System.out.println("实例化一个类，输出：");
        Test02 test021 = new Test02();

    }
}
