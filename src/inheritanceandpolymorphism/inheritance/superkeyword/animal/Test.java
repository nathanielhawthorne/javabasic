package inheritanceandpolymorphism.inheritance.superkeyword.animal;

public class Test {
    public static void main(String[]args){
        System.out.println("调用构造方法的结果是：");
        Dog dogTest = new Dog("red",4,50);
        System.out.println("调用方法和变量的结果是：");
        dogTest.dogPrintInfo();
    }
}
