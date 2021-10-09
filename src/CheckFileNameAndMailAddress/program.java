package CheckFileNameAndMailAddress;

import java.util.Scanner;

//校验文件名和邮箱地址，文件格式为png，邮箱为qq邮箱
public class program {
    static String fileNameInput;
    static String mailAddressInput;
    public static void main(String[]args){
        //校验的文件为png文件
        System.out.println("请输入你的文件名：");
        Scanner input1 = new Scanner(System.in);
        fileNameInput = input1.next();
        char char1 = fileNameInput.charAt(fileNameInput.length()-1);
        char char2 = fileNameInput.charAt(fileNameInput.length()-2);
        char char3 = fileNameInput.charAt(fileNameInput.length()-3);
        char char4 = fileNameInput.charAt(fileNameInput.length()-4);

        String str1 = String.valueOf(char1);
        String str2 = String.valueOf(char2);
        String str3 = String.valueOf(char3);
        String str4 = String.valueOf(char4);

        //System.out.println("请输入你的邮箱地址：");
        //Scanner input2 = new Scanner(System.in);
        //mailAddressInput = input2.next();
        if (str1.equals("g")&&str2.equals("n")&&str3.equals("p")&&str4.equals(".")){
            System.out.println("文件名正确！");
        }else {

            do {
                System.out.println("校验失败！");
                System.out.println("请输入你的文件名：");
                Scanner input3 = new Scanner(System.in);
                fileNameInput = input3.next();
                char char5 = fileNameInput.charAt(fileNameInput.length() - 1);
                char char6 = fileNameInput.charAt(fileNameInput.length() - 2);
                char char7 = fileNameInput.charAt(fileNameInput.length() - 3);
                char char8 = fileNameInput.charAt(fileNameInput.length() - 4);


                String str5 = String.valueOf(char5);
                String str6 = String.valueOf(char6);
                String str7 = String.valueOf(char7);
                String str8 = String.valueOf(char8);
                str1 = str5;
                str2 = str6;
                str3 = str7;
                str4 = str8;
                //System.out.println("请输入你的邮箱地址：");
                //Scanner input2 = new Scanner(System.in);
                //mailAddressInput = input2.next();

            } while (!str1.equals("g") || !str2.equals("n") || !str3.equals("p") || !str4.equals("."));
            System.out.println("文件名校验正确！");
        }
        System.out.println("请输入你的邮箱地址：");
        Scanner input4 = new Scanner(System.in);
        mailAddressInput = input4.next();
        char char9 = mailAddressInput.charAt(mailAddressInput.length()-1);
        char char10 = mailAddressInput.charAt(mailAddressInput.length()-2);
        char char11 = mailAddressInput.charAt(mailAddressInput.length()-3);
        char char12 = mailAddressInput.charAt(mailAddressInput.length()-4);
        char char13 = mailAddressInput.charAt(mailAddressInput.length()-5);
        char char14 = mailAddressInput.charAt(mailAddressInput.length()-6);
        char char15 = mailAddressInput.charAt(mailAddressInput.length()-7);


        String str9 = String.valueOf(char9);
        String str10 = String.valueOf(char10);
        String str11 = String.valueOf(char11);
        String str12 = String.valueOf(char12);
        String str13 = String.valueOf(char13);
        String str14 = String.valueOf(char14);
        String str15 = String.valueOf(char15);
        if (str9.equals("m")&&str10.equals("o")&&str11.equals("c")&&str12.equals(".")&&str13.equals("q")&&str14.equals("q")&&str15.equals("@")){
            System.out.println("邮箱输入正确！");
        }else {
            do {
                System.out.println("邮箱验证失败！");
                System.out.println("请输入你的邮箱地址：");
                Scanner input5 = new Scanner(System.in);
                mailAddressInput = input5.next();
                char char16 = mailAddressInput.charAt(mailAddressInput.length()-1);
                char char17 = mailAddressInput.charAt(mailAddressInput.length()-2);
                char char18 = mailAddressInput.charAt(mailAddressInput.length()-3);
                char char19 = mailAddressInput.charAt(mailAddressInput.length()-4);
                char char20 = mailAddressInput.charAt(mailAddressInput.length()-5);
                char char21 = mailAddressInput.charAt(mailAddressInput.length()-6);
                char char22 = mailAddressInput.charAt(mailAddressInput.length()-7);


                String str16 = String.valueOf(char16);
                String str17 = String.valueOf(char17);
                String str18 = String.valueOf(char18);
                String str19 = String.valueOf(char19);
                String str20 = String.valueOf(char20);
                String str21 = String.valueOf(char21);
                String str22 = String.valueOf(char22);

                str9 =str16;
                str10 =str17;
                str11 =str18;
                str12 =str19;
                str13 =str20;
                str14 =str21;
                str15 =str22;
            }while (!str9.equals("m")||!str10.equals("o")||!str11.equals("c")||!str12.equals(".")||!str13.equals("q")||!str14.equals("q")||!str15.equals("@"));
            System.out.println("邮箱输入正确！");
        }


    }
}
