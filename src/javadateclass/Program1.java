package javadateclass;

import java.util.Date;

//̫�������ˣ������࣬�о���ƿ����
public class Program1 {
    public static void main(String[]args){
        Date date = new Date();
        //System.out.println(date.toString());
        System.out.println(date);
        try {
            Thread.sleep(60000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        Date date2 = new Date();
        System.out.println("���ڵ�ʱ���ǣ�"+date2);
        System.out.println("������Ѿ���ȥ��"+(date2.getTime()-date.getTime())/1000+"��");


        Date date3 = new Date(2021,10,12);
        Date date4 = new Date(2021,10,13);
        int n = date3.compareTo(date4);

        if (date3.before(date4)){
            System.out.println("true");
        }else if (date3.after(date4)){
            System.out.println("false");
        }else if (date3.equals(date4)){
            System.out.println("����������һ����");
        }
        System.out.println(date3.getTime());
        System.out.println(date4.toString());
        System.out.println(n);
    }
}
