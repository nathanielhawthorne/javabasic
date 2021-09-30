package JavaString;

public class Arrayinterception2 {
    static char a[] = {'1','5','3','7','8','0','5','2'};
    static String str = new String(a,1,4);

    public static void main(String[]args){
        System.out.println(str);
        a[1] = '4';
        System.out.println(a);
    }

}
