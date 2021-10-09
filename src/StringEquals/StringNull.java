package StringEquals;
//String空和null的比较
public class StringNull {
    static String str1 = "";
    static String str2 = null;
    static String str3 = new String();
    public static void main(String[]args){
        System.out.println(str1.length());
        //System.out.println(str2.length());
        System.out.println(str3.length());
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
        System.out.println("----------------------------------------");
        System.out.println(str1==str3);
        System.out.println(str1.equals(str3));
        System.out.println("----------------------------------------");
        System.out.println(str2==str3);
        System.out.println(str2.equals(str3));

    }
}
