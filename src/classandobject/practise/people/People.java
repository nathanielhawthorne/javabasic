package classandobject.practise.people;
/*
（1）创建一个叫做People的类：

属性：姓名、年龄、性别、身高

行为：说话、计算加法、改名

编写能为所有属性赋值的构造方法；

（2）创建主类：

创建一个对象：名叫“张三”，性别“男”，年龄18岁，身高1.80；

让该对象调用成员方法：

说出“你好！”

计算23+45的值

将名字改为“李四”
 */
public class People {
    public String name;
    public int age;
    public boolean sex =false;
    public double height;
    

    public void speak(){
        System.out.println("你好");
    }
    public double caculate(double a,double b){
        return a+b;
    }
    public String changeName(String name){
        return name;
    }
    public People(String name,int age,boolean sex,double height){
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.height = height;
    }

}
