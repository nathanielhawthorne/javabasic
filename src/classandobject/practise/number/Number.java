package classandobject.practise.number;
/*
13.构造方法与重载 创建一个类 为该类定义三个构造函数 分别执行下列操作 1、传递两个整数值并找出其中较大的一个值
2、传递三个double值并求出其乘积 3、传递两个字符串值并检查其是否相同 4、在main方法中测试构造函数的调用
 */
public class Number {

    public Number(int a,int b){
        System.out.println("较大值是："+Math.max(a,b));
    }

    public Number(int a,int b,int c){
        System.out.println("乘积为："+(a*b*c));
    }
    public Number(String str1,String str2){
        boolean bool = str1.equals(str2);
        System.out.println("字符串比较结果（true代表相等，false代表不相等）："+bool);
    }

}
