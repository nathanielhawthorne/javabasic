package classandobject.practise.mytime;

public class Main {
    public static void main(String[]args){
        MyTime time = new MyTime(10,23,23);
        time.printInfo();
        time.addSecond(10);
        time.printInfo();
    }
}
