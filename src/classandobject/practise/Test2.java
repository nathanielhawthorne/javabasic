package classandobject.practise;
//
public class Test2 {
    public int add(int x){
        x+=30;
        System.out.println("形参x的值为："+x);
        return  x;
    }
    //成员方法，定义一个int形变并赋予计算方法，返回x的值
    public static void main(String[]args){
        int x = 150;
        System.out.println("调用add方法之前的x："+x);
        Test2 test = new Test2();
        int i = test.add(x);          //调用已有成员方法
        System.out.println("实参x的值："+x);
        System.out.println("调用add()方法的返回值："+i);
    }
}
