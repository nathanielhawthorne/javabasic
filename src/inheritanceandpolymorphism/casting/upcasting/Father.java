package inheritanceandpolymorphism.casting.upcasting;

public class Father {
    String name;
    int age;
    boolean bear;

    Father(String name,int age,boolean bear){
        this.name = name;
        this.age = age;
        this.bear = bear;
    }
    void work(){
        System.out.println("work");
    }
    void workTrip(){
        System.out.println("出差");
    }
    public String toString(){
        return "父亲的名字："+name+"父亲的年龄："+age+"父亲有没有胡子："+bear;
    }
}
