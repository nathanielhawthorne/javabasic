package JavaString;

public class Arrayinterception {
    static char a[] = {'2','4','7','3','5','2','6','8','3'};
    static String str = new String(a);

    public static void main(String[]args){
        a[1] = 3;
        System.out.println(str);
    }
}
