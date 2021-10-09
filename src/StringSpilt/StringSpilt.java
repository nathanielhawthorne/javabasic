package StringSpilt;
//·Ö¸î×Ö·û´®
public class StringSpilt {
    static String str = "sfdsf,dfsfds,fsfdsdf,WSQ,GFESGefsfs,gdhg,sfdsdf,sfdsf";
    static String arr1[] = str.split(",");
    static String arr2[] = str.split(",",4);
    public static void main(String[]args){
        for (int n = 0;n<arr1.length;n++){
            System.out.println(arr1[n]);
        }
        System.out.println("----------------------------------------------------");
        for (int n2 = 0;n2<arr2.length;n2++){
            System.out.println(arr2[n2]);
        }
    }
}
