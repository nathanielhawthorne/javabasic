package datecheck;

import java.util.Calendar;
import java.util.Scanner;

//�ж�ƽ������
public class program1 {
    public static void main(String[]args){
        Calendar calendar = Calendar.getInstance();
        System.out.println("��������Ҫ��ѯ����֣�");
        Scanner input = new Scanner(System.in);
        int yearInput = input.nextInt();
        calendar.set(Calendar.YEAR,yearInput);
        int output = calendar.get(Calendar.YEAR);
        System.out.println(output);
        //�ж�ƽ����ı�׼
        /*
        if (output){

        }else{}
        System.out.println("��Ҫ��ѯ�����Ϊ");
*/
    }
}
