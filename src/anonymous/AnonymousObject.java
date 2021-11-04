package anonymous;
//匿名对象
/*
在以上程序的主方法中可以发现，直接使用了“new Person("张三",30)”语句，这实际上就是一个匿名对象，
与之前声明的对象不同，此处没有任何栈内存引用它，所以此对象使用一次之后就等待被 GC（垃圾收集机制）回收。

匿名对象在实际开发中基本都是作为其他类实例化对象的参数传递的，在后面的 Java 应用部分的很多地方都可以发现其用法，
而且细心的读者可以发现，匿名对象实际上就是个堆内存空间，对象不管是匿名的还是非匿名的，都必须在开辟堆空间之后才可以使用。
 */
public class AnonymousObject {
    String name;
    int age;

    public AnonymousObject(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void printInfo(){
        System.out.println("名字是："+name+" "+"年龄是："+age);
    }

}
