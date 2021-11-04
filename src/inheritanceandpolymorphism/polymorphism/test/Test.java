/*

向下转型可以调用子类类型中所有的成员，不过需要注意的是如果父类引用对象指向的是子类对象，
那么在向下转型的过程中是安全的，也就是编译是不会出错误。但是如果父类引用对象是父类本身，
那么在向下转型的过程中是不安全的，编译不会出错，但是运行时会出现我们开始提到的 Java 强制类型转换异常，
一般使用 instanceof 运算符来避免出此类错误。

 */

package inheritanceandpolymorphism.polymorphism.test;
class Livestock{
    void eat(){System.out.println("家畜吃草");}
    void sleep(){System.out.println("家畜睡觉");}
}
class Cattle extends Livestock {
    void eat(){
        System.out.println("牛吃草");
    }
    void sleep(){
        System.out.println("牛睡觉");
    }
}
class Sheep extends Livestock{
    void eat(){System.out.println("羊吃草");}
    void sleep(){System.out.println("羊睡觉");}
}

public class Test {
    public static void main(String[]args){
        //定义为牛类，可变为其他类，但只能被还原为牛类
        Livestock livestock = new Cattle();
        livestock.eat();
        livestock.sleep();
        //还原为牛类，向下转型，可调用牛类属性方法
        System.out.println("---------------------------------------");
        Cattle cattle = (Cattle)livestock;
        livestock.eat();
        livestock.sleep();
        System.out.println("---------------------------------------");
        //变成羊类
        livestock = new Sheep();
        livestock.eat();
        livestock.sleep();
        System.out.println("---------------------------------------");
        //变成家畜类
        livestock = new Livestock();
        livestock.eat();
        livestock.sleep();
        /*

        //还原为牛类
        Cattle cattle1 = (Cattle)livestock;
        cattle1.eat();
        cattle1.sleep();

         */
        System.out.println("---------------------------------------");
        //变为牛类
        livestock = new Cattle();
        livestock.eat();
        livestock.sleep();
        System.out.println("---------------------------------------");
        //还原为牛类
        Cattle cattle1 = (Cattle)livestock;
        cattle1.eat();
        cattle1.sleep();
        System.out.println("---------------------------------------");
        //定义一个羊类
        System.out.println("定义一个羊类");
        Livestock livestock1 = new Sheep();
        livestock1.eat();
        livestock1.sleep();
        //变成牛类
        livestock1 = new Cattle();
        livestock1.eat();
        livestock1.sleep();
        //变成家畜类
        livestock1 = new Livestock();
        livestock1.eat();
        livestock1.sleep();
        //还原为羊类
        Livestock livestock2 = (Livestock)livestock1;
        livestock2.eat();
        livestock2.sleep();
        /*
        //错误示范，只能还原为自己对应的类
        Sheep sheep = (Sheep) livestock1;
        sheep.eat();
        sheep.sleep();
        //错误示范，还原为牛类
        Cattle cattle2 = (Cattle)livestock1;
        cattle2.eat();
        cattle2.sleep();

         */

    }
}
