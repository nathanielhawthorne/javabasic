package classandobject.practise;

public class Test04 {
    public void method1(){
        System.out.println("����һ");
    }
    public static void method2(){
        System.out.println("������");
    }
    public static void main(String[]args){
        Test04 test04 = new Test04();
        test04.method1();                            //�Ǿ�̬��������Ҫʵ������������
        method2();                                    //��̬��������ֱ�ӱ�����
    }
}
