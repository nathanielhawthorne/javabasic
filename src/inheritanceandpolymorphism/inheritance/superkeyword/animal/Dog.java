package inheritanceandpolymorphism.inheritance.superkeyword.animal;

public class Dog extends Animal{
    int toothNo = 100;
    String bark = "dogbarking";
    void dogPrintInfo(){
        super.animalPrintInfo();    //调用父类成员方法
        System.out.println("这条狗颜色为："+color+" "+"这条狗腿的数量为："+footNo+" "+"这条狗牙齿数量为："+toothNo);
        //super.bark = bark;
        System.out.println("叫的声音为："+super.bark);
    }
    Dog(String color,int footNo,int toothNo){
        super(color, footNo);  //调用父类构造方法
        System.out.println("狗的颜色为："+color+" "+"狗的脚的数量为："+footNo+" "+"狗的牙齿数量为："+toothNo);
    }
}
