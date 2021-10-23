package classandobject.practise;
import static java.lang.System.*;
import static java.lang.Math.*;

import classandobject.practise.Test02.*;
import static classandobject.practise.Test02.*;  //导入Test02的全部静态变量、静态方法
public class Test03 {
    /*
    main() 方法是静态的。如果要在 main() 方法中调用本类中的其他方法，则该方法也必须是静态的，
    否则需要先创建本类的实例对象，然后再通过对象调用成员方法。
     */
    public static void main(String[]args){   //String[] 字符串数组参数名
        out.println(PI);
        out.println(sqrt(256));
        Test02 test02 = new Test02();           //实例化Test02的一个对象
    }
}
