package javawhile;

public class dowhile {
    //����1-100�����ܱ�2����������
    public static void main(String[]args){
        int number1 = 1;
        do{
            if (number1%2==0){
                System.out.print(number1+"\t");
                if (number1%10==0){

                    System.out.println();
                }
            }
            number1++;
        }while (number1<=50);
    }
}
