package classandobject.practise.caculator;
/*
03.���췽�� ��дJava����ģ��򵥵ļ������� ������ΪNumber���������������������ݳ�Աn1��n2Ӧ����Ϊ˽�С�
��д���췽������n1��n2��ʼֵ��Ϊ���ඨ���addition����subtration����multiplication��
��division�ȹ��г�Ա�����ֱ��������Ա����ִ�мӡ������ˡ��������㡣
��main�����д���Number��Ķ�����ø�����������ʾ��������
 */
public class Method {
    private double n1;
    private double n2;

    public Method(double n1,double n2){
        System.out.println("�������Ϊ��"+(n1+n2));
        System.out.println("�������Ϊ��"+(n1-n2));
        System.out.println("�������Ϊ��"+n1*n2);
        System.out.println("�������Ϊ��"+n1/n2);
    }
}
