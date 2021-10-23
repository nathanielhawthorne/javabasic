package classandobject.practise;

public class Test01 {
    public static int count = 1;                      //静态成员才能在静态方法中被调用
    public int method1(){                             //定义一个成员方法
        count += 10;
        //System.out.println(count);
        test();                            //成员方法可以调用静态成员方法，静态成员方法不能调用成员方法

        return count;

    }

    public static int test(){                          //定义一个静态成员方法
        count -= 1;
        //System.out.println(count);

        return count;
    }

    public static void main(String[]args){
        Test01 test01 = new Test01();
        System.out.println(test01.method1());             //成员方法必须实例化类，才能被调用
        //System.out.println(test());                    //静态成员方法可以直接被调用
    }
}
