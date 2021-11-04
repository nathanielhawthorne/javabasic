package classandobject.practise.addition;

import classandobject.practise.point.A;

public class Main {
    public static void main(String[]args){
        Addition addition = new Addition(10,20);
        addition.printResult();
        Addition addition1 = new Addition(0,0);
        addition1.doubleAddition(33,45.9);
    }
}
