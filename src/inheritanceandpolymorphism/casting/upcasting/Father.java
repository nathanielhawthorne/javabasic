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
        System.out.println("����");
    }
    public String toString(){
        return "���׵����֣�"+name+"���׵����䣺"+age+"������û�к��ӣ�"+bear;
    }
}
