package classandobject.practise.people;

public class ZhangSan {
    public static void main(String[]args){
        People people = new People("张三",18,true,1.80);
        System.out.println(people.name+" "+people.age+" "+people.sex+" "+people.height);
        people.speak();
        System.out.println("10加20的值为："+people.caculate(10,20));
        System.out.println("更改后的名字为："+people.changeName("李四"));

    }
}
