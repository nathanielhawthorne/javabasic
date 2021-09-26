package javafor;

public class NineNineMultiplicationTable {
//³Ë·¨¿Ú¾÷±í
    public static void main(String[]args){
        for (int number1 = 1;number1<=9;number1++){
            for (int number2 = 1;number2<=number1;number2++){
                System.out.print(number1+"X"+number2+"="+number1*number2+"\t");
            }
            System.out.println();
        }
    }
}
