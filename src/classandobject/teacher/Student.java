package classandobject.teacher;
//this( )访问构造方法
public class Student {
    String name;
    // 无参构造方法（没有参数的构造方法）
    public Student() {
        this("张三");
    }
    // 有参构造方法
    public Student(String name) {
        this.name = name;
    }
    // 输出name和age
    public void print() {
        System.out.println("姓名：" + name);
    }
    public static void main(String[] args) {
        Student stu = new Student();
        stu.print();
    }
}