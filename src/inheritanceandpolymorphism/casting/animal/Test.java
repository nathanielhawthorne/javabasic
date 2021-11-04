package inheritanceandpolymorphism.casting.animal;

public class Test {
    public static void main(String[]args){
        Animal animal = new Cat();
        animal.eat();
        animal.sleep();

        Cat cat = (Cat)animal;
        cat.eat();
        cat.sleep();
    }

}
