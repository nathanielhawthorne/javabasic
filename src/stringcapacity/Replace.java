package stringcapacity;
//StringBuffer�滻�ַ�
public class Replace {
    public static void main(String[]args){
        StringBuffer content = new StringBuffer("���ӳ��ĵײ����");
        System.out.println(content);
        content.setCharAt(0,'��');
        System.out.println(content);
        content.setCharAt(7,'��');
        System.out.println(content);
    }
}
