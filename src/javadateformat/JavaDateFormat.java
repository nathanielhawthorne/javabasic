package javadateformat;

import java.text.SimpleDateFormat;
import java.util.Date;

//Java���ڸ�ʽ����DateFormat���SimpleDateFormat�ࣩ
public class JavaDateFormat {
    public static void main(String[]args){
        Date date = new Date();
        SimpleDateFormat f = new SimpleDateFormat("" +
                "������"+"yyyy��MM��dd��E�� HH��mm��ss��SSS���룬����ĵ�D�죬" +
                "����µĵ�dd��");
        System.out.println(f.format(date));
    }
}
