package array;

import java.util.Scanner;

public class JavaArray {
    public static void main(String[]args){
        String[] score = new String[10];
        int[] number;
        number = new int[5];
        int[] number1 = new int[5];
        number1[0] = 1;
        number1[1] = 2;
        number1[2] = 3;
        number1[3] = 4;
        number1[4] = 5;
        /*
        �������Աָֻ��������ĳ��ȣ���ôϵͳ������Ϊ��Щ����Ԫ�ط����ʼֵ��ָ����ʼֵʱ��ϵͳ�����¹�������ʼֵ��

        ����Ԫ�ص������ǻ��������е��������ͣ�byte��short��int �� long����������Ԫ�ص�ֵ�� 0��
        ����Ԫ�ص������ǻ��������еĸ������ͣ�float��double����������Ԫ�ص�ֵ�� 0.0��
        ����Ԫ�ص������ǻ��������е��ַ����ͣ�char����������Ԫ�ص�ֵ�ǡ�\u0000����
        ����Ԫ�ص������ǻ��������еĲ������ͣ�boolean����������Ԫ�ص�ֵ�� false��
        ����Ԫ�ص��������������ͣ��ࡢ�ӿں����飩��������Ԫ�ص�ֵ�� null��

         */
        int[] number2 = new int[5];
        number2[0] = 1;
        int[] number3 = {1,2,3,4,5};
        //System.out.println(number3[5]);
        Scanner input = new Scanner(System.in);
        for (int n = 0;n<number.length;n++){
            System.out.println("�������"+(n+1)+"������");
            number[n] = input.nextInt();
        }
        System.out.println("�����ε�������"+number[2]);

        int[] number4 = {1,2,3,4,5};
        for (int val : number4){
            System.out.print(val+"\t");
        }


    }
}
