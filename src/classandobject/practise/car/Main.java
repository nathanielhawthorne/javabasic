package classandobject.practise.car;

public class Main {
    public static void main(String[]args){
        Car car = new Car(4,"red");

        Car car1 = new Car(100);
        car.addSpeed(100);
        car.printInfo();
        car1.printInfo();

    }

}
