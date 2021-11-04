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
        return "名字："+name+" "+"年龄："+age+" "+"性别："+sex+"身份证号码："+id+" "+"教龄："+tYear+" "+"教授专业："+tDepart;

    }
}
