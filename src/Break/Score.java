package Break;

import java.util.Arrays;
import java.util.Scanner;

public class Score {
    public static void main(String[]args){
        double mount = 0;

        for (int number = 0;number<=5;number++){
            String [] str = {"����","��ѧ","Ӣ��","����","��ѧ","����"};
            String str2[] = Arrays.copyOfRange(str, number, number+1);// ��ȡnumber��Ӧ��ѧ��
            String object = Arrays.toString(str2);
            System.out.println("������"+object+"�ķ���");
            Scanner input = new Scanner(System.in);
            double score = input.nextDouble();
            while(score<0||score>100){
                System.out.println("������������������");
                Scanner input1 = new Scanner(System.in);
                double score1 = input1.nextDouble();
                score = score1;
            }
            mount += score;

        }
        System.out.println("����ܷ���"+mount);
    }
}
