package Continue;

import java.util.Scanner;

public class one {
    static int inputnumber;
    public static void main(String[]args){
        for (int number = 1;number<=10;number++) {
            System.out.println("������1-10");
            Scanner input = new Scanner(System.in);
            inputnumber = input.nextInt();
            if (inputnumber==3){
                continue;
            }
            System.out.println("�����������Ϊ��"+inputnumber);
        }
    }
}
