package classandobject.practise;

public class Pig {
    public static String skinColor;
    public static String foot;
    public static double weight;
    protected static int eyes;

    public void eat(){
        System.out.println("�Է�");
    }
    public void sleep(){
        eat();
        System.out.println("˯��");
    }

    public static void main(String[]args){
        String test = "test";
        skinColor = "black";
        foot = "pigfoot";
        eyes = 2;
        Pig pig = new Pig();
        pig.sleep();
        System.out.println(skinColor);
    }
}
