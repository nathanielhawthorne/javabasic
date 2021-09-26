package javawhile;

public class dowhile {
    //计算1-100以内能被2整除的整数
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
