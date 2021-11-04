package classandobject.practise.addition;
/*
10.构造方法与重载、包 编写Addition类 该类中应包含一组实现两数相加运算的重载方法。 实现加法运算的方法
应接受两个参数 ，即加数和被加数 ，方法将两个参数进行加法运算后 返回相加结果。考虑可能针对不同的数据类型进行计算，
重载一组方法 包括整型、长整型、浮点型、双精度浮点型、还有字符串。 在main方法中创建Addition类的实例
分别调用重载方法测试其效果。 应将Addition类打入到包中 以自己名字的拼音为包命名。
-----------------------------------
java面向对象练习题
https://blog.51cto.com/u_15054039/3543932
 */
public class Addition {
    int n1;
    int n2;

    public Addition(int n1,int n2){
        this.n1 = n1;
        this.n2 = n2;

    }
    public void printResult(){
        System.out.println("两个数据之和为："+(n1+n2));
    }
    public void doubleAddition(double a,double b){
        double sum = a + b;
        System.out.println(sum);
    }
}
