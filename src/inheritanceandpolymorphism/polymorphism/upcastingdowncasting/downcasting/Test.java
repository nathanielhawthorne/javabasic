package inheritanceandpolymorphism.polymorphism.upcastingdowncasting.downcasting;

class A {
    public void print() {
        System.out.println("A:print");
    }
}

class B extends A {
    public void print() {
        System.out.println("B:print");
    }
    public void funcB(){
        System.out.println("funcB");
    }
}

class C extends A {
    public void print() {
        System.out.println("C:print");
    }
    public void funcC(){
        System.out.println("funcC");
    }
}

public class Test{
    public static void func(A a)
    {
        a.print();
        if(a instanceof B)
        {
            B b = (B)a;   //����ת��,ͨ������ʵ��������
            b.funcB();    //����B����еķ���
        }
        else if(a instanceof C)
        {
            C c = (C)a;  //����ת��,ͨ������ʵ��������
            c.funcC();   //����C����еķ���
        }
    }

    public static void main(String args[])
    {
        func(new A());
        func(new B());
        func(new C());
    }
}
//�������ӡ���Կ���,���ǳɹ�ͨ������ת��������B���C����еķ���.