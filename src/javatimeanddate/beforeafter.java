package javatimeanddate;

import java.util.Date;
import java.util.Scanner;

/*
����ʹ��һ��ʵ����������ʾ Date ���ʹ�á�
���裬ĳһ���ض�ʱ��Ҫȥ��һ���£������Ǹ�ʱ���Ѿ���ȥһ����֮�������������»�û�а죬
��ʱϵͳ������ʾ�Ѿ���ȥ�˶� ��ʱ�䡣����Ĵ������£�
 */
public class beforeafter {
    public static void main(String[]args){
        String something;
        System.out.println("������Ҫ�����£�");
        Scanner input = new Scanner(System.in);
        something = input.next();
        Date sthDate = new Date();
        try {
            Thread.sleep(60000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        Date doDate = new Date();
        System.out.println("������Ѿ���ȥ��"+(doDate.getTime()-sthDate.getTime())/1000+"��");
    }
}
