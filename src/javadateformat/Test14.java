package javadateformat;

import java.util.Calendar;
public class Test14 {
    // ����һ����Ҫ�Ͽε�����������Ϊ��һ���ܶ������干3���Ͽ�
    public static final int HAVEClass_OF_WEEK = 3;
    // ������Ҫ�ϵĿδ�
    public static final int COURSENUM = 9;
    public static void main(String[] args) {
        int weekCount = -1; // ��������ȫ���γ���Ҫ�����ܣ�ȡ����
        int surplusDay = -1; // ȡ������������
        int count = 0; // ��ȡ���˶��ٴο�
        int surplusClass = -1; // ȡ������ʣ�Ŀγ���
        int total = 0; // �Ͽ�������ʱ������
        Calendar calendar = Calendar.getInstance();
        // ��ȡ�������ܼ�
        int weekdays = (calendar.get(Calendar.DAY_OF_WEEK) - 1);
        /*
         * ����һ������Ҫ�Ͽε����������Ͽ�һ����count+1 ��һ���ܶ��������Ͽ� �������������������ֻ�������Ͽ�
         */
        switch (weekdays) {
            case 0:
            case 1: // �Ͽ�
                count++;
            case 2: // �Ͽ�
                count++;
            case 3:
            case 4:
            case 5: // �Ͽ�
                count++;
            case 6:
                break;
        }
        /*
         * ����������ܼ������������ĩ������㵽�������м��� ����Ϊ������һ�ܵĿ�ʼ��
         */
        if (0 != weekdays)
            surplusDay = 6 - weekdays;
        // ��ȡ�Ͽ����ö����ܣ�ȡ��
        weekCount = (COURSENUM - count) / HAVEClass_OF_WEEK;
        // ��ȡȡ����ʣ�µĿγ���
        surplusClass = (COURSENUM - count) - (weekCount * HAVEClass_OF_WEEK);
        /*
         * ����ȡ���ܺ�ʣ�µĴ�������ÿ���տ�ʼ���� ����ʣ�γ̣�������-1����Ϊȡ��������һ��Ϊ���������ϿΣ� ��������������
         * ����ʣ1�ڿΣ��϶�����һ�ϿΣ���������+2�� ����ʣ2�ڿΣ�����һ���ܶ��ϿΣ���������+3�� ����ʣ3�ڿΣ�����һ���ܶ��������ϿΣ���������+6��
         */
        switch (surplusClass) {
            case 0:
                surplusDay = surplusDay - 1;
                break;
            case 1:
                surplusDay += 2;
                break;
            case 2:
                surplusDay += 3;
                break;
            case 5:
                surplusDay += 6;
                break;
        }
        // Ҫ�Ͽ����õ�������
        total = surplusDay + (weekCount * 7);
        // ���ÿγ̽������������
        calendar.set(Calendar.DAY_OF_MONTH, calendar.get(Calendar.DAY_OF_MONTH) + total);
        String strWeek = "";
        int week = (calendar.get(Calendar.DAY_OF_WEEK) - 1);
        switch (week) {
            case 1:
                strWeek = "һ";
                break;
            case 2:
                strWeek = "��";
                break;
            case 3:
                strWeek = "��";
                break;
            case 4:
                strWeek = "��";
                break;
            case 5:
                strWeek = "��";
                break;
            case 6:
                strWeek = "��";
                break;
            case 7:
                strWeek = "��";
                break;
        }
        // ���ȡ����ʣ�µĿγ���Ϊ�㣬ֱ��ȡ���������
        System.out.println("���뱾ѧ�ڽ������� " + total + " �죬����Ϊ��" + calendar.get(Calendar.YEAR) + "-"
                + (calendar.get(Calendar.MONTH) + 1) + "-" + calendar.get(Calendar.DATE) + "������" + strWeek);
    }
}