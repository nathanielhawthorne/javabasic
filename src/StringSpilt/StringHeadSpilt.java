package StringSpilt;
//��ȡ���ű���
public class StringHeadSpilt {
    static String str[] = {"����������ͳ�°��������й���ϯ������","�����ɹ��������˺���ɴ�",
            "�Ĵ�����ɭ�ַ������֣����ʮ���Ͼ�","���ƻ������˹��ͳ�վ�",
            "MH370ʧ�����������ڽ�һ��������"};
    public static void main(String[]args){
        for (int number = 0;number<5;number++){
            if (str[number].length()>5){
                System.out.println(str[number].substring(0,5)+"...");
            }else {
                System.out.println(str[number]);
            }
        }
    }
}
