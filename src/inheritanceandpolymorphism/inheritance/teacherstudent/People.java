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
        return "���֣�"+name+"��ͣ�"+age+"�Ա�"+sex+"���֤���룺"+id;
    }
}
