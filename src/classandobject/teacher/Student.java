package classandobject.teacher;
//this( )���ʹ��췽��
public class Student {
    String name;
    // �޲ι��췽����û�в����Ĺ��췽����
    public Student() {
        this("����");
    }
    // �вι��췽��
    public Student(String name) {
        this.name = name;
    }
    // ���name��age
    public void print() {
        System.out.println("������" + name);
    }
    public static void main(String[] args) {
        Student stu = new Student();
        stu.print();
    }
}