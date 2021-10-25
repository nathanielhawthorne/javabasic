package classandobject.practise.vehicles;


public class Main {
    public static void main(String[]args){
        Vehicles car = new Vehicles("TOYOTA","red");
        car.run();
        System.out.println(car.showInfo());
    }
}