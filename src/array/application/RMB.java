package array.application;

import java.util.Scanner;

//Java��Ŀʵս������ת����Ҷ���������Դ��ͽ�����
public class RMB {
    public static void main(String[]args){
        char[] number = {'1','2','3','4','5','6','7','8','9','0'};
        String[] rmbNumber = {"Ҽ","��","��","��","��","½","��","��","��","��","ʰ","��","Ǫ","��"};
        System.out.print("��������Ҫת��Ϊ����Ҷ��������֣�");
        Scanner input = new Scanner(System.in);
        String inputNumber = input.next();
        char[] char1 = inputNumber.toCharArray();
        //System.out.print(char1);
        if (inputNumber.length()==1){
            for (int n1 = 0;n1<number.length;n1++){
                if (char1[0]==number[n1]){
                    System.out.print(rmbNumber[n1]);
                }
            }
        }
        if(inputNumber.length()==2){
            int[][] number1 = new int[10][10];
            for (int n2 = 0;n2<number.length;n2++){
                for (int n3 = 0;n3<number.length;n3++){
                    if (char1[0] == number[n2]&&char1[1]==number[n3]){
                        System.out.print(rmbNumber[n2]+rmbNumber[10]+rmbNumber[n3]);
                    }
                }

            }
        }
        if(inputNumber.length()==3){
            int[][][] number1 = new int[10][10][10];
            for (int n2 = 0;n2<number.length;n2++){
                for (int n3 = 0;n3<number.length;n3++){
                    for (int n4 = 0;n4<number.length;n4++){
                        if (char1[0] == number[n2]&&char1[1]==number[n3]&&char1[2]==number[n4]){
                            System.out.print(rmbNumber[n2]+rmbNumber[11]+rmbNumber[n3]+rmbNumber[10]+rmbNumber[n4]);
                        }
                    }

                }

            }
        }
        if(inputNumber.length()==4){
            for (int n2 = 0;n2<number.length;n2++){
                for (int n3 = 0;n3<number.length;n3++){
                    for (int n4 = 0;n4<number.length;n4++){
                        for (int n5 = 0;n5<number.length;n5++){
                            if (char1[0] == number[n2]&&char1[1]==number[n3]&&char1[2]==number[n4]&&char1[3]==number[n5]){
                                System.out.print(rmbNumber[n2]+rmbNumber[12]+rmbNumber[n3]+rmbNumber[11]+rmbNumber[n4]+rmbNumber[10]+rmbNumber[n5]);
                            }
                        }

                    }

                }

            }
        }
        if(inputNumber.length()==5){}

    }
}
