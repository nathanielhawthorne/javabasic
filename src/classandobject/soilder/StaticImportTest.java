package classandobject.soilder;

import static java.lang.System.*;
import static java.lang.Math.*;
public class StaticImportTest {
    public static void main(String[] args) {
        // out是java.lang.System类的静态成员变量，代表标准输出
        // PI是java.lang.Math类的静态成员变量，表示π常量
        out.println(PI);
        // 直接调用Math类的sqrt静态方法，返回256的正平方根
        out.println(sqrt(256));
        out.println();
    }
}