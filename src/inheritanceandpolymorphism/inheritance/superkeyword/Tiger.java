package inheritanceandpolymorphism.inheritance.superkeyword;

public class Tiger extends Animal{
    int rawNo;
    Tiger(String color,double weight,int rawNo){
        super(color, weight);
        this.rawNo = rawNo;
    }
    void printInfo(){
        System.out.println("��ֻ�ϻ�����ɫ��"+color+" "+"����"+weight+" "+"צ��������"+rawNo);
    }
}
