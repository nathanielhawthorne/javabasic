package array.application;

import java.util.Scanner;

//Javaͳ����Ʒ��Ϣ,��һ���������� 5 ����Ʒ����д������������Ʒ�۸�֮�������߼۸��ܼ۸��ƽ���۸�
public class StatisticalProductInformation {
    public static void main(String[]args){
        double[] productPriceArray = new double[5];
        for (int n = 0;n<5;n++){
            System.out.print("�������"+(n+1)+"����Ʒ�۸�");
            Scanner input = new Scanner(System.in);
            Double productPrice = input.nextDouble();
            productPriceArray[n] = productPrice;
        }
        double max = 0;
        double min = 0;
        max = min = productPriceArray[0];
        double result = 0;
        for (int n1 = 0;n1<5;n1++){
            //System.out.print(productPriceArray[n1]+" ");
            if (productPriceArray[n1]>max){
                max = productPriceArray[n1];

            }
            result += productPriceArray[n1];

        }
        System.out.print("���ֵ��"+max);
        System.out.print("��Ʒ�ܼ۸�Ϊ��"+result);
        System.out.print("��Ʒƽ���۸�Ϊ��"+result/5);


    }
}
