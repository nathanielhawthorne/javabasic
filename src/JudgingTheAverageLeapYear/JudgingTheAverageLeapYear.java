package JudgingTheAverageLeapYear;

import java.util.Scanner;

/*
�ж�����ƽ�겢���ĳ�µ�����

    ��Ԫ��ݳ���4������������ƽ�ꡣ
    ��Ԫ��ݳ���100���������ҳ���400������������ƽ��
    ��Ԫ��ݳ���4���������ҳ���100�������������c�ꡣ
    ��Ԫ��ݳ���400�����������c�ꡣ

    ����ƽ��365(1-12�·ֱ�Ϊ31�죬28�죬31�죬30�죬31�죬30�죬31�죬31�죬30�죬31�죬30�죬31��)��
    ����1-12�·ֱ�Ϊ31�죬29�죬31�죬30�죬31�죬30�죬31�죬31�죬30�죬31�죬30�죬31�죬
    ��������2�·���ƽ���28���Ϊ29�죬���깲��366�졣


 */
public class JudgingTheAverageLeapYear {
    static int year;
    static int month;
    static String str;
    public static void main(String[]args){
        System.out.println("**************************");
        System.out.println("*                        *");
        System.out.println("* ��ӭ����ƽ�����·ݲ�ѯϵͳ��*");
        System.out.println("*                        *");
        System.out.println("**************************");
        System.out.println("��q������");
        Scanner input = new Scanner(System.in);
        str = input.next();
        while (!str.equals("q")){
            System.out.println("��������밴q������");
            Scanner input4 = new Scanner(System.in);
            String str1 = input4.next();
            str = str1;
        }


        System.out.println("��������Ҫ��ѯ����ݣ�");
        Scanner input1 = new Scanner(System.in);
        year = input1.nextInt();
            if (year % 4 != 0 ||( year % 100 == 0 && year % 400 != 0)) {
                System.out.println(year+"����ƽ��");
                System.out.println("��������Ҫ��ѯ���·�");
                Scanner input2 = new Scanner(System.in);
                month = input2.nextInt();
                if (month==1||month==3||month==5||month==7||month==8||month==10||month==12){
                    System.out.println(year+"��"+month+"�¹���31��");
                }else if(month==4||month==6||month==9||month==11){
                    System.out.println(year+"��"+month+"�¹���30��");
                }else if(month==2){
                    System.out.println(year+"��"+month+"�¹���28��");
                }

            }
            if ((year % 4 == 0 && year % 100 != 0 )|| year % 400 == 0) {
                System.out.println(year+"��������");
                System.out.println("��������Ҫ��ѯ���·�");
                Scanner input2 = new Scanner(System.in);
                month = input2.nextInt();
                if (month==1||month==3||month==5||month==7||month==8||month==10||month==12){
                    System.out.println(year+"��"+month+"�¹���31��");
                }else if(month==4||month==6||month==9||month==11){
                    System.out.println(year+"��"+month+"�¹���30��");
                }else if(month==2){
                    System.out.println(year+"��"+month+"�¹���29��");
                }
            }

    }
}
