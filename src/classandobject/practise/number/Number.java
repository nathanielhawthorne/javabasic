package classandobject.practise.number;
/*
13.���췽�������� ����һ���� Ϊ���ඨ���������캯�� �ֱ�ִ�����в��� 1��������������ֵ���ҳ����нϴ��һ��ֵ
2����������doubleֵ�������˻� 3�����������ַ���ֵ��������Ƿ���ͬ 4����main�����в��Թ��캯���ĵ���
 */
public class Number {

    public Number(int a,int b){
        System.out.println("�ϴ�ֵ�ǣ�"+Math.max(a,b));
    }

    public Number(int a,int b,int c){
        System.out.println("�˻�Ϊ��"+(a*b*c));
    }
    public Number(String str1,String str2){
        boolean bool = str1.equals(str2);
        System.out.println("�ַ����ȽϽ����true������ȣ�false������ȣ���"+bool);
    }

}
