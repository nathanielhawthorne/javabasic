package classandobject.practise;

public class Dog {

    public void run(){
        System.out.println("你是个哈狗");
    }
    public void jump(){
        Dog dog = new Dog();
        this.run();
        System.out.println("你真的是个哈狗");
    }
    public void offWear(){
        System.out.println("脱衣服");
    }
    public void sleep(){
        offWear();
        System.out.println("睡觉");
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
