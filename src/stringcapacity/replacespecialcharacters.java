package stringcapacity;

import java.util.Scanner;

//Java StringBuffer�滻�����ַ�
/*
�ڱ�ʵ����Ϊ��֤ѧ������� Java �ļ����ϸ�
������ StringBuffer ��ʵ�ֶ� Java �ļ����е�������Ž����滻��
����������״̬�µġ�������ȫ��״̬�µġ�.���滻ΪӢ��״̬�µġ�.����
 */
public class replacespecialcharacters {
    public static void main(String[]args){
        StringBuffer fileName = new StringBuffer("");//����java�ļ���
        StringBuffer result = new StringBuffer("");
        String inputFileName;//���������java�ļ���
        System.out.println("������java�ļ�����");
        Scanner input = new Scanner(System.in);
        inputFileName = input.next();
        char[] arrayInputFileName = inputFileName.toCharArray();//��������ַ���ת��Ϊ����
        for (int number = 0;number<inputFileName.length();number++){//����������ַ���
            //System.out.println(arrayInputFileName[number]);//��ӡ����������ÿһ����
            String  stringArrayInputFileName = Character.toString(arrayInputFileName[number]);
            //������������ÿһ����ת��Ϊ�ַ�
            if (stringArrayInputFileName.equals("��")){//�ҳ�������ַ�����������ľ�ŵ�
                StringBuffer stringBufferInputName = new StringBuffer(stringArrayInputFileName);
                //�½�һ��StringBuffer���������ڴ洢���ڡ��������ַ�
                stringBufferInputName.replace(0,1,".");//�滻����.���ַ�
                //System.out.println(stringBufferInputName);
                stringArrayInputFileName = stringBufferInputName.toString();

            }
            System.out.print(stringArrayInputFileName);

        }



    }
}
