package StringTrim;
//�����Ŀո�ת��ΪӢ�Ŀո�
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
