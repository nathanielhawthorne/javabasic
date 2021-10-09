package stringipverify;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Javaʹ��������ʽ��֤IP��ַ
 */
public class IpVerify {
    public static void main(String[]args){
        String ipAddress;//����һ���������ڴ洢ip��ַ
        String answer;//����һ���������ڴ洢�Ƿ����¼�����Ĵ�
        String regex = "[0123456789]\\.[0123456789]\\.[0123456789]\\.[0123456789]|[0123456789][0123456789]\\.[0123456789][0123456789]\\.[0123456789][0123456789]\\.[0123456789][0123456789]|[12][012345][012345]\\.[12][012345][012345]\\.[12][012345][012345]\\.[12][012345][012345]";
        //����һ��regex��������ƥ��ip��ַ���ֱ�ƥ��һλ����ip����λ����ip����λ����ip����Ϊ�������̫�ֻ࣬��������
        do {
            System.out.println("������ip��ַ��");
            Scanner input = new Scanner(System.in);
            ipAddress = input.next();
            Pattern p = Pattern.compile(regex);//����һ��pattern���ڴ洢������ʽ
            Matcher m = p.matcher(ipAddress);//����һ����ַ���ں�����ƥ��
            boolean bool = m.matches();//����ƥ����
            if (bool){
                System.out.println("ip��ַ¼��ɹ���");
            }else {
                System.out.println("�����ʽ�����⣬���������룡");
            }
            System.out.println("��Ҫ������?y/n");
            answer = input.next();
        }while(answer.equalsIgnoreCase("y"));
    }
}
