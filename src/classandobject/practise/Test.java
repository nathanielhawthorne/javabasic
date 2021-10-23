package classandobject.practise;

public class Test {
    public int returnMin(int m,int n){
        return Math.min(m,n);      //形参
    }

    public static void main(String[]args){
        int x = 50;
        int y = 100;
        Test test = new Test();
        int i =test.returnMin(x,y);    //实参
        System.out.println(i);
    }

}
