package inheritanceandpolymorphism.inheritance.superkeyword;

public class Tiger extends Animal{
    int rawNo;
    Tiger(String color,double weight,int rawNo){
        super(color, weight);
        this.rawNo = rawNo;
    }
    void printInfo(){
        System.out.println("这只老虎的颜色："+color+" "+"重量"+weight+" "+"爪子数量："+rawNo);
    }
}
