package inheritanceandpolymorphism.polymorphism.upcastingdowncasting.upcasting;

class A {
    public void print() {
        System.out.println("A:print");
    }
}

class B extends A {
    public void print() {
        System.out.println("B:print");
    }
}

public class Test{
    public static void main(String args[])
    {
        A a = new B();          //通过子类去实例化父类
        a.print();
    }
}
/*
如下所示,可以看到打印的是class B的print,这是因为我们通过子类B去实例化的,
所以父类A的print方法已经被子类B的print方法覆盖了.从而打印classB的print.
这样做的意义在于:

    当我们需要多个同父的对象调用某个方法时,通过向上转换后,则可以确定参数的统一.方便程序设计(参考下面示例)

 */