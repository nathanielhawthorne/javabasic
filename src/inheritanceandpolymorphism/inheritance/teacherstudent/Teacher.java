package inheritanceandpolymorphism.inheritance.teacherstudent;

public class Teacher extends People {
    public double tYear;
    public String tDepart;
    public Teacher(String name,int age,boolean sex,String id,double tYear,String tDepart){
        super(name, age, sex, id);
        this.tYear = tYear;
        this.tDepart = tDepart;
    }
    public String toString(){
        return "���֣�"+name+" "+"���䣺"+age+" "+"�Ա�"+sex+"���֤���룺"+id+" "+"���䣺"+tYear+" "+"����רҵ��"+tDepart;

    }
}
