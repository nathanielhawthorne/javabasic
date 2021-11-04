package objectpropertiesandbehaviour;
//在 Java 中，要引用对象的属性和行为，需要使用点（.）操作符来访问。对象名在圆点左边，
// 而成员变量或成员方法的名称在圆点的右边。语法格式如下：
//
//对象名.属性(成员变量)    // 访问对象的属性
//对象名.成员方法名()    // 访问对象的方法
public class ObjectPropertiesAndBehaviour {
    String name;
    boolean sex;
    int age;
    public boolean isSex(){
        return sex;
    }


    public void printInfo(){
        System.out.println("名字是："+name+"性别为："+sex+"年龄为："+age);
    }
}
