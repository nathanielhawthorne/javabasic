package StringEquals;
//�Ƚ��ַ������Ⱥ�˳��,Java String compareTo()�������ڰ��ֵ�˳��Ƚ������ַ�����
// �����ַ�����ÿ���ַ���ת��Ϊ Unicode ֵ�Խ��бȽϡ�
// ��������ַ�������ȣ���˷������� 0�����򷵻���ֵ��ֵ��
// �����һ���ַ������ֵ�˳����ڵڶ����ַ���������Ϊ����������Ϊ����
public class StringUnicode {
    static String str1 = "jd";
    static String str2 = "la";
    public static void main(String[]args){
        System.out.println(str1.compareTo(str2));
    }
}
