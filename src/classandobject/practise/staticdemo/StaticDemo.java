package classandobject.practise.staticdemo;
/*
14.Static关键字与普通变量的区别 创建一个名称为StaticDemo的类 并声明一个静态变量和一个普通变量。
对变量分别赋予10和5的初始值。在main()方法中输出变量值。
 */
public class StaticDemo {
    public static int number1;
    public int number2;

    public StaticDemo(int number1,int number2){
        System.out.println("静态："+number1+" "+"非静态："+number2);
    }
}
