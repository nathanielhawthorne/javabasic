package inheritanceandpolymorphism.casting.upcasting;

public class Son extends Father {
    String school;
    String depart;

    Son(String name,int age,boolean bear,String school,String depart){
        super(name, age, bear);
        this.school = school;
        this.depart = depart;
    }
    void sleep(){
        System.out.println("睡觉");
    }
    void eat(){
        System.out.println("吃饭");
    }
    public String toString(){
        return "儿子的名字："+name+"儿子的年龄："+age+"儿子有没有胡子："+bear+"儿子的学校："+school+"儿子的专业："+depart;
    }
}
