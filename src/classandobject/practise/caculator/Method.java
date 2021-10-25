package classandobject.practise.caculator;
/*
03.构造方法 编写Java程序模拟简单的计算器。 定义名为Number的类其中有两个整型数据成员n1和n2应声明为私有。
编写构造方法赋予n1和n2初始值再为该类定义加addition、减subtration、乘multiplication、
除division等公有成员方法分别对两个成员变量执行加、减、乘、除的运算。
在main方法中创建Number类的对象调用各个方法并显示计算结果。
 */
public class Method {
    private double n1;
    private double n2;

    public Method(double n1,double n2){
        System.out.println("两数相加为："+(n1+n2));
        System.out.println("两数相减为："+(n1-n2));
        System.out.println("两数相乘为："+n1*n2);
        System.out.println("两数相除为："+n1/n2);
    }
}
