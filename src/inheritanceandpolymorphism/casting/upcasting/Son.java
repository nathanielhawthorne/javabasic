package inheritanceandpolymorphism.casting.upcasting;

public class Son extends Father {
    String school;
    String depart;

    Son(String name,int age,boolean bear,String school,String depart){
        super(name, age, bear);
        this.school = school;
        this.depart = depart;
    }
    void sleep(){
        System.out.println("˯��");
    }
    void eat(){
        System.out.println("�Է�");
    }
    public String toString(){
        return "���ӵ����֣�"+name+"���ӵ����䣺"+age+"������û�к��ӣ�"+bear+"���ӵ�ѧУ��"+school+"���ӵ�רҵ��"+depart;
    }
}
