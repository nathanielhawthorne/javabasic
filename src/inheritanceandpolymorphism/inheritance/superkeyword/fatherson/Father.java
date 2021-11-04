package inheritanceandpolymorphism.inheritance.superkeyword.fatherson;

public class Father {
    String name;
    int age;

    Father(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return "父亲的名字："+name+" "+"父亲的年龄："+age;
    }

}
