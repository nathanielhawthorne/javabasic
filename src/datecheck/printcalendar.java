package datecheck;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

//��ӡ��������2021��10��Ϊ��
public class printcalendar {
    public static void main(String[]args){
        /*
        Calendar calendar = Calendar.getInstance();
        int numberMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        //��ȡÿ�����������
        System.out.println(numberMonth);
        System.out.println("�����Ǳ��ܵ�"+(calendar.get(Calendar.DAY_OF_WEEK)-1)+"��");
        System.out.println("�����Ǳ��µ�"+(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH)+1)+"��");
        System.out.println("�����Ǳ��µ�"+calendar.get(Calendar.DAY_OF_MONTH)+"��");
        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(2021,9,1);
        System.out.println("���õ���ʱ����"+calendar1.getTime());
        System.out.println("���µ�һ��������"+(calendar1.get(Calendar.DAY_OF_WEEK)-1));

        for (int n = 1;n<=numberMonth;n++){
            calendar1.set(Calendar.DAY_OF_MONTH,n);
            //����һ���µĵڼ���
            //System.out.println("����������"+(calendar1.get(Calendar.DAY_OF_WEEK)-1));
            switch (calendar1.get(Calendar.DAY_OF_WEEK)-1){
                case 0:
                    System.out.print("������\t");
                    break;
                case 1:
                    System.out.print("����һ\t");
                    break;
                case 2:
                    System.out.print("���ڶ�\t");
                    break;
                case 3:
                    System.out.print("������\t");
                    break;
                case 4:
                    System.out.print("������\t");
                    break;
                case 5:
                    System.out.print("������\t");
                    break;
                case 6:
                    System.out.print("������\t");
                    break;

            }
            if (calendar1.get(Calendar.DAY_OF_WEEK)-1==6){
                System.out.println();
            }
        }

         */
        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
        DateFormat df1 = DateFormat.getTimeInstance(DateFormat.SHORT);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.SHORT);
        DateFormat df3 = DateFormat.getInstance();
        System.out.println(df.format(new Date())+"\t"+df1.format(new Date()));
        Calendar calendar = df.getCalendar();
        System.out.println(calendar.getTime());
        System.out.println(df.getTimeZone());

    }
}
