package regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//�ҳ���Ӧ�ַ�������ʼ�ͽ���λ��
public class regexStartEnd {
    public static void main(String[]args){
        String content = "hello my best dark friend my precious";

        Matcher m = Pattern.compile("\\w+").matcher(content);
        while (m.find()){
            System.out.println(m.group() +"���ִ���ʼλ��Ϊ��" +m.start()+"�����λ��Ϊ��" + m.end());
        }
    }
}
