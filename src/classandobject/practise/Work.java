package classandobject.practise;

public class Work {
    public String name;
    public int age;
//����һ�����췽�������ڷ�������������ֵ
    public Work(String name,int age){
        this.name = name;
        this.age = age;
    }
//����һ�����������ڷ������ҽ������
    /*
    Object �����һ�� toString() �������÷����Ǹ�����ķ�����������ÿ���඼��̳и÷�����
    ������һ�� String ���͵��ַ��������һ�����ж����˸÷��������ڵ��ø������ʱ��
    �����Զ����ø������� toString() ��������һ���ַ�����
    Ȼ��ʹ�á�System.out.println(������)���Ϳ��Խ����ص��ַ������ݴ�ӡ������

     */
    public String toString(){
        return "�ҵ������ǣ�"+name+" "+"�ҵ������ǣ�"+age;
    }

    public static void main(String[]args){
        Work work = new Work("�ܽ�",25);
        System.out.println(work);
        Work work1 = new Work("xiongjin",16);
    }
}
