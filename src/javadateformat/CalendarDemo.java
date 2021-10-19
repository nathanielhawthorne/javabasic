package javadateformat;
//�����֪ʶҲ�����ᣬ�������������
//����ʹ�� Calendar ����ʵ�������Ĵ�ӡ���ܣ�����ʵ�����£�
import java.util.Calendar;
public class CalendarDemo {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2021, 10, 1); // ʵ�ʵ�calendar��������ʾ������Ϊ2016��6��1��
        // �ж�2016��6��1��Ϊһ���еĵڼ���
        int index = calendar.get(Calendar.DAY_OF_WEEK) - 1;
        char[] title = { '��', 'һ', '��', '��', '��', '��', '��' }; // ���Ի����ͷ��
        int daysArray[][] = new int[6][7];// �������������
        int daysInMonth = 31; // ���µ�����
        int day = 1; // �Զ�����
        for (int i = index; i < 7; i++) {
            // ����һ�ܵ��������ݣ��������еĵ�һ��
            daysArray[0][i] = day++;
        }
        for (int i = 1; i < 6; i++) {
            // ��������ܵ��������ݣ�������
            for (int j = 0; j < 7; j++) {
                // �����ǰday��ʾ���Ǳ������һ�죬��ֹͣ�������м�����ֵ
                if (day > daysInMonth) {
                    i = 6;
                    break;
                }
                daysArray[i][j] = day++;
            }
        }
        System.out.println("------------------2016 �� 6 ��--------------------\n");
        for (int i = 0; i < title.length; i++) {
            System.out.print(title[i] + "\t");
        }
        System.out.print("\n");
        // �����Ԫ����daysArray�е�Ԫ��
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                if (daysArray[i][j] == 0) {
                    if (i != 0) {
                        // �������ĩ���������ʾ����������ֹͣ�÷�����ִ��
                        return;
                    }
                    System.out.print("\t");
                    continue;
                }
                System.out.print(daysArray[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }
}