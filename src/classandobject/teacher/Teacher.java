package classandobject.teacher;

public class Teacher {
    private String name;
    private int age;
    private double salary;

    public Teacher(String name,double salary,int age){
        this.age = age;
        this.name = name;
        this.salary = salary;
    }
    public static void main(String[]args){
        Teacher teacher = new Teacher("xiong",100000,22);
        System.out.println("����"+teacher.name+"����"+teacher.age+"н��"+teacher.salary);
    }
}