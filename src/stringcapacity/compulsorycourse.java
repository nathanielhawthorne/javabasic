package stringcapacity;

import java.util.Scanner;

//ÿ����ѧ�ڿ�ʼ��ѧУ������Ա�ѧ�ڿγ��г����޿γ̡�
// ��дһ�� Java ����Ҫ���û������̨ѭ��¼�����ű��޿γ����ƣ�������������ƽ������ӣ����������Ӻ���ַ�����
// �������£�
public class compulsorycourse {

    public static void main(String[]args){
        String className;//����һ�ű��޿γ�����
        StringBuffer courseName = new StringBuffer();//����һ��StringBuffer����
        for (int n = 1;n<6;n++){//������ογ�����
            System.out.println("�������"+n+"�ſγ����֣�");
            Scanner input = new Scanner(System.in);
            className = input.next();
            courseName.append(className+"\t");//��ÿһ�α����Ľ��������

        }


        System.out.println(courseName);



    }
}
