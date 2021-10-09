package regexphonenumber;



import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
��ע���Աʱ��������Ҫ����绰���룬�绰������ָ�ֻ�������߹̶��绰��
�����������ݲ��Ϸ���������û������ʾ��
��ʵ��ģ��ʵ�ֵ绰�������֤���ܣ������û��ڿ���̨����ĵ绰���룬Ȼ������жϣ�������������

 */
public class PhoneNumberVerify {
    public static void main(String[]args){
        String regex = "0\\d{2,3}[-]?\\d{7,8}|" +
                "0\\d{2,3}\\s?\\d{7,8}|13[0-9]\\d{8}|15[1089]\\d{8}";
        //����һ��������ʽ����ƥ��绰����
        String phoneNumber;//����һ���ַ��������ڴ洢���������
        String input2 = "y";

        do {
            System.out.println("��������ĵ绰���룺");
            Scanner input = new Scanner(System.in);
            phoneNumber = input.next();
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(phoneNumber);
            boolean bool = m.matches();
            if (bool){
                System.out.println("����绰������ȷ������¼��ɹ���");
            }else {
                System.out.println("��������������������룺");

            }
            System.out.println("����y/n������");
            input2 = input.next();
        }while(input2.equalsIgnoreCase("y"));
    }
}
