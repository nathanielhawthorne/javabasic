package classandobject.practise.method;

public class Main {
    public static void main(String[]args){
        Method method = new Method(10,20);
        method.setA(100);
        System.out.println("更改了值的a："+method.getA());
    }
}
