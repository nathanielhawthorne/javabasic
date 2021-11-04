package inheritanceandpolymorphism.inheritance.teacherstudent;

public class People {
    public String name;
    public int age;
    public boolean sex = false;
    public String id;

    public People(String name,int age,boolean sex,String id){
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.id = id;
    }
    public String toString(){
        return "名字："+name+"年纪："+age+"性别："+sex+"身份证号码："+id;
    }
}
