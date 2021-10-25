package classandobject.practise.point;

public class A {
    public static void main(String[]args){
        Point test = new Point(10,20);
        System.out.println();
        test.setX(11);
        System.out.println(test.getX());
        test.setY(22);
        System.out.println(test.getY());
        test.total(33,44);

    }
}
