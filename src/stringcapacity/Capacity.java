package stringcapacity;
//String����
public class Capacity {
    static StringBuffer string = new StringBuffer();//����һ��StringBuffer����Ĭ������Ϊ16
    static StringBuffer string2 = new StringBuffer(10);//����һ��StringBuffer���󣬲�����������Ϊ10
    static StringBuffer string3 = new StringBuffer("�����л�");//����һ��StringBuffer���󣬲���Ĭ�������������ĸ��ַ�
    public static void main(String[]args){
        System.out.println(string.capacity());
        System.out.println(string2.capacity());
        System.out.println(string3.capacity());
    }
}
