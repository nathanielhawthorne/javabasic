package classandobject.practise;

public class Dog {

    public void run(){
        System.out.println("���Ǹ�����");
    }
    public void jump(){
        Dog dog = new Dog();
        this.run();
        System.out.println("������Ǹ�����");
    }
    public void offWear(){
        System.out.println("���·�");
    }
    public void sleep(){
        offWear();
        System.out.println("˯��");
    }
    public void eat(){}
    public void bark(){}
    public void walk(){}

    public static void main(String[]args){
        Dog d = new Dog();
        d.jump();
        d.sleep();

    }
}
