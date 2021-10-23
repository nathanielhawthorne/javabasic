package classandobject.practise;
/*
public class Student {
    String name;


    public Student(){
        this("xiong");

    }
    public Student(String name){
        this.name = name;
    }
    public void print(){
        System.out.println("姓名："+name);

    }
    public static void main(String[]args){
        Student student = new Student();
        student.print();

    }
}

 */
public class Student implements Cloneable{
    private String name;
    private int age;

    public Student(){
        this.name = "name";
        this.age = 0;
    }
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }
     public String toString(){
        return "学生名字:"+name+"，年龄"+age;
     }
     public static void main(String[]args)throws Exception{
        Student student = new Student("xiong",22);
        student.toString();

         Class c = Class.forName("Student");
         Student student1 = (Student)c.newInstance();
         System.out.println(student1);

         Student student2 = (Student)student1.clone();
         System.out.println(student2);
     }


}
