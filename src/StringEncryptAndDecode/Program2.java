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
        //加密模式
        StringBuffer result = new StringBuffer();//定义一个StringBuffer变量用于存储最终结果
        System.out.println("请输入要加密的内容：");
        Scanner input = new Scanner(System.in);
        inputString = input.next();
        char[] arrayInputString = inputString.toCharArray();//Create a new variable arrayInputString, convert the input string to char and save it in this variable
        for (int n1 = 0;n1<inputString.length();n1++){//定义输入字符串的遍历次数
            //System.out.print(arrayInputString[n1]+"\t");//循环遍历输入字符数组的每一个字符
            String stringArrayInputString = String.valueOf(arrayInputString[n1]);//将循环遍历到的每一个数组个体转换为字符
            for (int n2 =0;n2 <originCode.length();n2++){//定义原码的遍历次数
                //System.out.println(arrayOriginCode[n2]+"\t");//将分割后的原码转换为数组并遍历
                String stringArrayOriginCode = String.valueOf(arrayOriginCode[n2]);//将循环遍历到的每一个原码个体转换为字符
                if (stringArrayInputString.equals(stringArrayOriginCode)){
                    //System.out.print(String.valueOf(arrayEncryptCode[n2]));//输出被加密的字符
                    result.append(String.valueOf(arrayEncryptCode[n2]));//将加密后的字符存储在result中
                }
            }
        }
        System.out.println("加密后的内容为：");
        System.out.println(result);
        //解密模式



    }
}
