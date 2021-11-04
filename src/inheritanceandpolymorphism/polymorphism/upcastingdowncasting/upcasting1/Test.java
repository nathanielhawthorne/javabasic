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
        func(new B());  //�ȼ��� A a =new B();
        func(new C());  //�ȼ��� A a =new C();
    }
}
//PS:����ת��ʱ,����ֻ�ܵ��ø��෽���������าд��ķ���,�������еĵ������������޷����õ�.