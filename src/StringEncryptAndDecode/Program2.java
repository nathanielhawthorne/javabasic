package StringEncryptAndDecode;

import java.util.Scanner;

//Java string implements simple encryption and decryption
public class Program2 {
    static String inputString;//Define an input string variable
    static String originCode = "qwertyuiopasdfghjkl!zxcvbnm.,";//Define the range of input characters
    static char[] arrayOriginCode = originCode.toCharArray();//Convert the original code to an array
    static String encryptCode = "1234567890-=/`~@#$%^&*()_+{}|<>?[]:;'";//Define the characters used for encryption
    static char[] arrayEncryptCode = encryptCode.toCharArray();//Convert the characters used for encryption to an array
    public static void main(String[]args){//main method
        //����ģʽ
        StringBuffer result = new StringBuffer();//����һ��StringBuffer�������ڴ洢���ս��
        System.out.println("������Ҫ���ܵ����ݣ�");
        Scanner input = new Scanner(System.in);
        inputString = input.next();
        char[] arrayInputString = inputString.toCharArray();//Create a new variable arrayInputString, convert the input string to char and save it in this variable
        for (int n1 = 0;n1<inputString.length();n1++){//���������ַ����ı�������
            //System.out.print(arrayInputString[n1]+"\t");//ѭ�����������ַ������ÿһ���ַ�
            String stringArrayInputString = String.valueOf(arrayInputString[n1]);//��ѭ����������ÿһ���������ת��Ϊ�ַ�
            for (int n2 =0;n2 <originCode.length();n2++){//����ԭ��ı�������
                //System.out.println(arrayOriginCode[n2]+"\t");//���ָ���ԭ��ת��Ϊ���鲢����
                String stringArrayOriginCode = String.valueOf(arrayOriginCode[n2]);//��ѭ����������ÿһ��ԭ�����ת��Ϊ�ַ�
                if (stringArrayInputString.equals(stringArrayOriginCode)){
                    //System.out.print(String.valueOf(arrayEncryptCode[n2]));//��������ܵ��ַ�
                    result.append(String.valueOf(arrayEncryptCode[n2]));//�����ܺ���ַ��洢��result��
                }
            }
        }
        System.out.println("���ܺ������Ϊ��");
        System.out.println(result);
        //����ģʽ



    }
}
