package Break;

import java.util.Scanner;

public class Run {
    public static void main(String[]args){
        String answer;
        for (int circle = 1;circle <= 10;circle++){
            System.out.println("���������"+circle+"Ȧʱ���������㶥������ס����Ļش���(yes or no)��");
            Scanner input = new Scanner(System.in);
            answer = input.next();
            if (answer.equals("yes")){
                System.out.println("�ܺã�������");
            }else if (answer.equals("no")){
                System.out.println("�ðɣ�����Ϊֹ!����");
                break;
            }

        }
    }
}
