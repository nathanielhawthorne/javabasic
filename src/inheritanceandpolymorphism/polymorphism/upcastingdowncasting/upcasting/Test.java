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
        A a = new B();          //ͨ������ȥʵ��������
        a.print();
    }
}
/*
������ʾ,���Կ�����ӡ����class B��print,������Ϊ����ͨ������Bȥʵ������,
���Ը���A��print�����Ѿ�������B��print����������.�Ӷ���ӡclassB��print.
����������������:

    ��������Ҫ���ͬ���Ķ������ĳ������ʱ,ͨ������ת����,�����ȷ��������ͳһ.����������(�ο�����ʾ��)

 */