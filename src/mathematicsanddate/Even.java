package mathematicsanddate;

import java.util.Random;

//����ʹ�� random() ����ʵ���������һ�� 2~100 ż���Ĺ��ܡ�����������£�
public class Even {
    public static void main(String[]args){
        Random r = new Random();//�������[0,1)��С��
        int number = r.nextInt(100)+1;//�������[1,101)������
        if (number%2==0){
            System.out.println(number);
        }else {
            System.out.println(number+1);
        }
    }
}
