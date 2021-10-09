package StringTrim;
//把中文空格转换为英文空格
public class StringTrimZHCN {
    static String str = "      fdsfsfsdfsf    fdsdsfs   ";
    public static void main(String[]args){
        System.out.println(str.length());
        System.out.println(str.trim().length());
        str = str.replace((char)12288,' ');
        System.out.println(str.length());
        System.out.println(str.trim().length());
    }
}
