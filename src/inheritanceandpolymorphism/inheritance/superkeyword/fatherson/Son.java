package inheritanceandpolymorphism.inheritance.superkeyword.fatherson;

public class Son extends Father {
    double height;
    double weight;

    Son(String name,int age,double height,double weight){
        super(name, age);
        this.height = height;
        this.weight = weight;
    }
    public String toString(){
        return "���ӵ����֣�"+name+" "+"���ӵ����䣺"+age+" "+"���ӵ����"+height+" "+"���ӵ�����"+weight;
    }
}
