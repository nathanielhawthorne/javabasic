package inheritanceandpolymorphism.polymorphism.upcastingdowncasting.upcasting1;

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

class C extends B {
    public void print() {
        System.out.println("C:print");
    }
}

public class Test{
    public static void func(A a)
    {
        a.print();
    }

    public static void main(String args[])
    {
        func(new B());  //等价于 A a =new B();
        func(new C());  //等价于 A a =new C();
    }
}
//PS:向上转型时,父类只能调用父类方法或者子类覆写后的方法,而子类中的单独方法则是无法调用的.