package inheritanceandpolymorphism.inheritance.superkeyword.animal;

public class Animal {
    String color = "yellow";  //父类初始化一个变量用于存储颜色
    int footNo = 4;           //父类初始化一个变量用于存储动物脚的数量
    String bark = "barking";  //父类初始化一个变量用于存储动物叫的定义

    //定义一个无返回值成员方法
    void animalPrintInfo(){
        System.out.println("初始化动物颜色为"+color+" "+"脚的数量为："+footNo);
    }
    //父类定义一个有参构造方法
    Animal(String color,int footNo){
        System.out.println("动物初始化颜色为："+color+" "+"动物初始化脚的数量为："+footNo);
    }
}
