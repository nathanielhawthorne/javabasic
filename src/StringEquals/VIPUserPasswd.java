package StringEquals;

import java.util.Scanner;

//��¼��Աϵͳ�������û������룬���ִ�Сд
public class VIPUserPasswd {
    static String user = "admin";
    static String passwd = "root";
    static String userinput;
    static String passwdinput;
    static String code;
    static String key;
    static String keyboard= "`,1,2,3,4,5,6,7,8,9,0,-,=,q,w,e,r,t,y,u,i,o,p,[,],a,s,d,f,g,h,j,k,l,;,',z,x,c,v,b,n,m,,,.,/";
    static String Spilt[] = keyboard.split(",");
    public static void main(String[]args){
        System.out.println("***************************************");
        System.out.println("***                                 ***");
        System.out.println("***              �𾴵Ŀͻ����       ***");
        System.out.println("***             ��ӭ�����ֶ�ϴ�ų�     ***");
        System.out.println("***                                 ***");
        System.out.println("***************************************");
        System.out.println("�������������");
        Scanner input1 = new Scanner(System.in);
        code = input1.next();
        for (int number = 0;number<44;number++){
            //System.out.println(Spilt[number]);
            if (code.equalsIgnoreCase(Spilt[number])){
                System.out.println("�������");
                break;
            }
        }
        System.out.println("����������û�����");
        Scanner input = new Scanner(System.in);
        userinput = input.next();
        System.out.println("������������룺");
        Scanner input2 = new Scanner(System.in);
        passwdinput = input1.next();
        if (userinput.equalsIgnoreCase(user)&&passwdinput.equalsIgnoreCase(passwd)){
            System.out.println("��ӭ���������ܣ�");
        }else {
            System.out.println("�����û���������ٴ����룡\n����������û�����");
            do {
                //System.out.println("����������û�����");
                Scanner input3 = new Scanner(System.in);
                userinput = input3.next();
                System.out.println("������������룺");
                Scanner input4 = new Scanner(System.in);
                passwdinput = input4.next();
            } while (!userinput.equalsIgnoreCase(user)&&!passwdinput.equalsIgnoreCase(passwd));
            System.out.println("��ӭ���������ܣ�");
        }
    }
}
