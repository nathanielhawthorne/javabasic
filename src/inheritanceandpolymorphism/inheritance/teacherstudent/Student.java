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
        return "���֣�"+name+" "+"���䣺"+age+" "+"�Ա�"+sex+" "+"���֤���룺"+id+" "+"ѧ���ţ�"+stuNo+" "+"רҵ��"+department;
    }
}
