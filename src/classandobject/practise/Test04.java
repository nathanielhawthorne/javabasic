package classandobject.practise;

public class Test04 {
    public void method1(){
        System.out.println("方法一");
    }
    public static void method2(){
        System.out.println("方法二");
    }
    public static void main(String[]args){
        Test04 test04 = new Test04();
        test04.method1();                            //非静态方法必须要实例化对象后调用
        method2();                                    //静态方法可以直接被调用
    }
}
