package array.application;

import java.util.Scanner;

//Java统计商品信息,在一个货架上有 5 件商品，编写程序，在输入商品价格之后输出最高价格、总价格和平均价格。
public class StatisticalProductInformation {
    public static void main(String[]args){
        double[] productPriceArray = new double[5];
        for (int n = 0;n<5;n++){
            System.out.print("请输入第"+(n+1)+"件商品价格：");
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
        System.out.print("最大值是"+max);
        System.out.print("商品总价格为："+result);
        System.out.print("商品平均价格为："+result/5);


    }
}
