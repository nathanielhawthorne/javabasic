package inheritanceandpolymorphism.inheritance.superkeyword.animal;

public class Dog extends Animal{
    int toothNo = 100;
    String bark = "dogbarking";
    void dogPrintInfo(){
        super.animalPrintInfo();    //���ø����Ա����
        System.out.println("��������ɫΪ��"+color+" "+"�������ȵ�����Ϊ��"+footNo+" "+"��������������Ϊ��"+toothNo);
        //super.bark = bark;
        System.out.println("�е�����Ϊ��"+super.bark);
    }
    Dog(String color,int footNo,int toothNo){
        super(color, footNo);  //���ø��๹�췽��
        System.out.println("������ɫΪ��"+color+" "+"���Ľŵ�����Ϊ��"+footNo+" "+"������������Ϊ��"+toothNo);
    }
}
