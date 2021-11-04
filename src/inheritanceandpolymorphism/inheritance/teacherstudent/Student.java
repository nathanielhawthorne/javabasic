package inheritanceandpolymorphism.inheritance.teacherstudent;

public class Student extends People{
    public String stuNo;
    public String department;
    public Student(String name,int age,boolean sex,String id,String stuNo,String department) {
        super(name, age, sex, id);
        this.stuNo = stuNo;
        this.department = department;
    }
    public String toString(){
        return "名字："+name+" "+"年龄："+age+" "+"性别："+sex+" "+"身份证号码："+id+" "+"学生号："+stuNo+" "+"专业："+department;
    }
}
