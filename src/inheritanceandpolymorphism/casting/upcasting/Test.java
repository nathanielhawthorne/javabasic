package inheritanceandpolymorphism.casting.upcasting;

public class Test {
    public static void main(String[]args){
        //向上转型
        System.out.println("以下是向上转型结果：");
        Father father = new Son("jin",25,false,"none","program");
        father.age = 30;
        //向上转型为父类，无法调用子类的变量
        //只能调用父类的方法
        father.work();
        father.workTrip();
        System.out.println(father);
        //向下转型
        System.out.println("以下是向下转型结果：");
        Son son = (Son)father;
        //可直接调用子类的变量
        son.depart = "network";
        son.school = "peking university";
        //可调用子类的方法
        son.eat();
        son.sleep();
        System.out.println(son);
    }
}
