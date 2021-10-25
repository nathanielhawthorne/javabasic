package classandobject.practise.personalinfo;

public class UserInfo {
    public static void main(String[]args){
        Method method = new Method("xiong","root","xiongjin@fot.ltd");
        System.out.println(method.printInfo());
        Method method1 = new Method("cao","root");
        System.out.println(method1.printInfo());
    }
}
