package StringIndex;
//�����ַ������һ�γ��ֵ�λ��
public class StringLastIndex {
    static String str = "hello,world!";
    public static void main(String[]args){
        System.out.println(str.lastIndexOf("l"));
        System.out.println(str.lastIndexOf("l",4));
        //����ָ���ַ��ڴ��ַ��������һ�γ��ִ�����������ָ����������Ϊ��ֹ�㣬��������������
        // �����ָ���ַ���Ӧ����������ֵ��������ַ�����û���������ַ����򷵻� -1��
        System.out.println(str.lastIndexOf("l",5));
        System.out.println(str.lastIndexOf("l",6));
        System.out.println(str.lastIndexOf("l",1));
        System.out.println(str.lastIndexOf("l",10));
    }
}
