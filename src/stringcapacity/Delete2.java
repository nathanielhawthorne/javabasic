package stringcapacity;
//ɾ��һ����Χ�ڵ�StringBuffer������
public class Delete2 {
    public static void main(String[]args){
        StringBuffer content = new StringBuffer("hello!world!");
        content.delete(0,2);
        System.out.println(content);
        content.delete(0,2);
        System.out.println(content);
    }
}
