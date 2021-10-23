package classandobject.practise;

public class Work {
    public String name;
    public int age;
//定义一个构造方法，用于返回两个变量的值
    public Work(String name,int age){
        this.name = name;
        this.age = age;
    }
//定义一个方法，用于返回自我介绍语句
    /*
    Object 类具有一个 toString() 方法，该方法是个特殊的方法，创建的每个类都会继承该方法，
    它返回一个 String 类型的字符串。如果一个类中定义了该方法，则在调用该类对象时，
    将会自动调用该类对象的 toString() 方法返回一个字符串，
    然后使用“System.out.println(对象名)”就可以将返回的字符串内容打印出来。

     */
    public String toString(){
        return "我的名字是："+name+" "+"我的年龄是："+age;
    }

    public static void main(String[]args){
        Work work = new Work("熊金",25);
        System.out.println(work);
        Work work1 = new Work("xiongjin",16);
    }
}
