原文链接：
https://www.cnblogs.com/lifexy/p/10812841.html
1. 父子对象之间的转换分为了向上转型和向下转型,它们区别如下:

    + 向上转型 : 通过子类对象(小范围)实例化父类对象(大范围),这种属于自动转换
    + 向下转型 : 通过父类对象(大范围)实例化子类对象(小范围),这种属于强制转换
2. 在java中,向下转型则是为了,通过父类强制转换为子类,从而来调用子类独有的方法(向下转型,在工程中很少用到).
   
   为了保证向下转型的顺利完成,在java中提供了一个关键字:instanceof,通过instanceof可以判断某对象是否是某类的实例,如果是则返回true,否则为false,instanceof使用如下:
```java
A a = new B();                 //向上转型 (B类是A的子类)

a instanceof A;                //返回true.
a instanceof B;                //返回true
a instanceof C;                //返回false
```
