package StringEncryptAndDecode;
//Java�ַ���ʵ�ּ򵥼��ܽ��ܣ�δ���
import java.lang.reflect.Array;
import java.util.Scanner;

//Java�ַ���ʵ�ּ򵥼��ܽ���
public class Program {
    static String originCode;
    static String sampleCode = "1,2,3,4,5,6,7,8,9,0,-,=,q,w,e,r,t,y,u,i,o,p,[,],a,s,d,f,g,h,j,k,l,;,',z,x,c,v,b,n,m,.,/,!,`,~,@,#,$,%,^,&,*,(,),_,+,{,},|,:,<,>";
    static String spiltSampleCode[] = sampleCode.split(",");
    static String spiltSampleCode2 = String.valueOf(spiltSampleCode);
    static String sampleCode2 = "?\t?\t?\t?\t?\t?\t?\t?\t?\t?\t?\t?\t?\t?\t?\t?" +
            "?\t?\t?\t?\t?\t?\t?\t?\t?\t?\t?\t?\t?\t?\t?\t?" +
            "?\t?\t?\t?\t?\t?\t?\t?\t?\t?\t?\t?\t?\t?\t?\t?" +
            "?\t?\t?\t?\t?\t?\t?\t?\t?\t?\t?\t?\t?\t?\t?\t?" +
            "?\t?\t?\t?\t?\t?\t?\t?\t?\t?\t?\t?\t?\t?\t?\t?" +
            "?\t?\t?\t?\t?\t?\t?\t?\t?\t?\t?\t?\t?\t?\t?\t?" +
            "?\t?\t?\t?\t?\t?\t?\t?\t?\t?\t?\t?\t?\t?\t?\t";
    static String sampleCode3 = sampleCode2.replaceAll("\t",",");
    static String spiltSampleCode4[] = sampleCode3.split(",");
    static String spiltSampleCode5 = String.valueOf(spiltSampleCode4);
    static int choice;
    static String encryptCode;
    static String decode;
    public static void main(String[]args){
        System.out.println(sampleCode.length());
        System.out.println("��ӭ��¼��");

        System.out.println("---------------------------------------");
        System.out.println("|                                      |");
        System.out.println("|      1.����                           |");
        System.out.println("|      2.����                           |");
        System.out.println("|                                      |");
        System.out.println("---------------------------------------");
        System.out.println("��ѡ����Ҫ���еĲ�����");
        Scanner input1 = new Scanner(System.in);
        choice = input1.nextInt();
        if (choice==1){
            System.out.println("������Ҫ���ܵ����ݣ�");
            Scanner input2 = new Scanner(System.in);
            originCode = input2.next();
            String originCodeSpilt[] = originCode.split("");
            String originCodeSpilt2 = String.valueOf(originCodeSpilt);
            for (int n3 = 0;n3<originCodeSpilt[n3].length();n3++){
                for (int n = 0;n<spiltSampleCode[n].length();n++){
                    //System.out.println(spiltSampleCode[n]);
                    if (originCodeSpilt[n3].equals(spiltSampleCode[n])){
                        System.out.println(spiltSampleCode4[n]);
                    }
                    System.out.println(spiltSampleCode4[n]);

                }
            }
            //String strSpiltCode = String.valueOf(spiltCode);


        }
        if (choice==2){}

    }
}
