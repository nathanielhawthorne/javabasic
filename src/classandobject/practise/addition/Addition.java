package classandobject.practise.addition;
/*
10.���췽�������ء��� ��дAddition�� ������Ӧ����һ��ʵ�����������������ط����� ʵ�ּӷ�����ķ���
Ӧ������������ ���������ͱ����� �������������������мӷ������ ������ӽ�������ǿ�����Բ�ͬ���������ͽ��м��㣬
����һ�鷽�� �������͡������͡������͡�˫���ȸ����͡������ַ����� ��main�����д���Addition���ʵ��
�ֱ�������ط���������Ч���� Ӧ��Addition����뵽���� ���Լ����ֵ�ƴ��Ϊ��������
-----------------------------------
java���������ϰ��
https://blog.51cto.com/u_15054039/3543932
 */
public class Addition {
    int n1;
    int n2;

    public Addition(int n1,int n2){
        this.n1 = n1;
        this.n2 = n2;

    }
    public void printResult(){
        System.out.println("��������֮��Ϊ��"+(n1+n2));
    }
    public void doubleAddition(double a,double b){
        double sum = a + b;
        System.out.println(sum);
    }
}
