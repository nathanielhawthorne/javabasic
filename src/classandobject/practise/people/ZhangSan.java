package classandobject.practise.people;

public class ZhangSan {
    public static void main(String[]args){
        People people = new People("����",18,true,1.80);
        System.out.println(people.name+" "+people.age+" "+people.sex+" "+people.height);
        people.speak();
        System.out.println("10��20��ֵΪ��"+people.caculate(10,20));
        System.out.println("���ĺ������Ϊ��"+people.changeName("����"));

    }
}
