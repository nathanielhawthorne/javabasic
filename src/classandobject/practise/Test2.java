package classandobject.practise;
//
public class Test2 {
    public int add(int x){
        x+=30;
        System.out.println("�β�x��ֵΪ��"+x);
        return  x;
    }
    //��Ա����������һ��int�α䲢������㷽��������x��ֵ
    public static void main(String[]args){
        int x = 150;
        System.out.println("����add����֮ǰ��x��"+x);
        Test2 test = new Test2();
        int i = test.add(x);          //�������г�Ա����
        System.out.println("ʵ��x��ֵ��"+x);
        System.out.println("����add()�����ķ���ֵ��"+i);
    }
}
