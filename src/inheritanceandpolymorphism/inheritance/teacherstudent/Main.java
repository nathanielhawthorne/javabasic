package inheritanceandpolymorphism.inheritance.teacherstudent;

public class Main {
    public static void main(String[]args){
        People student = new Student("xiongjin",25,true,"510623...","efds43","通信技术");
        System.out.println(student);
        People teaPeople = new Teacher("xiong",34,true,"32432desfw",10,"通信技术");
        System.out.println(teaPeople);
    }
}
