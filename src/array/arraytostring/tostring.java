package array.arraytostring;
//字符串转化为数组
public class tostring {
    public static void main(String[]args){
        String str = "2324fdsf4903";
        char[] char1 = str.toCharArray();
        for (int n = 0;n<str.length();n++){
            System.out.print(char1[n]);
        }
        System.out.println();
        String str1 = "34rk4j435532";
        String[] str2 = str1.split("");
        for (int n1 = 0;n1<str1.length();n1++){
            System.out.print(str2[n1]);
        }
/*
        System.out.println();
        String str3 = "34.3.43543.3245325242.543543..435345.345";
        String[] str4 = str3.split("\\.");
        for (int n5 = 0;n5<str3.length();n5++){
            System.out.print(str4[n5]);
        }


 */
        System.out.println();
        String str5 = "2424|32432jfdkgj|3432jjh|";
        String[] str6 = str5.split("\\|");
        for (int n6 = 0;n6<str5.length();n6++){
            System.out.print(str6[n6]);
        }
        System.out.println();
        String str7 = "warew2432and343299or324kjekand";
        String[] str8 = str7.split("nad|or");
        for (int n7 = 0;n7<str7.length();n7++){
            System.out.println(str8[n7]);
        }
    }
}
