package classandobject.soilder;

import static java.lang.System.*;
import static java.lang.Math.*;
public class StaticImportTest {
    public static void main(String[] args) {
        // out��java.lang.System��ľ�̬��Ա�����������׼���
        // PI��java.lang.Math��ľ�̬��Ա��������ʾ�г���
        out.println(PI);
        // ֱ�ӵ���Math���sqrt��̬����������256����ƽ����
        out.println(sqrt(256));
        out.println();
    }
}