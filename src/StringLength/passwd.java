package StringLength;

import java.util.Scanner;

/*
��ѧ����Ϣ����ϵͳ�жԹ���Ա�����������Ĺ涨�������볤�ȱ������ 6 λ��С�� 12 λ��
��Ϊ����̫�����ױ��ƽ⣬̫���Ļ��ֲ����׼�ס��
�����Ҫ���Ȼ�ȡ�û�����������ַ�����Ȼ����� length() ������ȡ���ȣ�������һ���ĳ����жϣ�����ʵ�ִ���������ʾ��
 */
public class passwd {
    static String passwd;
    public static void main(String[]args){
        do {
            System.out.println("������������룺");
            Scanner input = new Scanner(System.in);
            passwd = input.next();
        }while(passwd.length()<=6||passwd.length()>=12);
        System.out.println("����¼��ɹ���");
    }
}
