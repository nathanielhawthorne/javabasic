package regularexpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//������ʽ��Ӧ�ã�̫���ˣ��ȶ��ˣ����ã������㣬�Ժ󶼲�Ҫ�ںȾ��ˣ����
public class program {
    public static void main(String[]args){
        Pattern p = Pattern.compile("ihateallofyou");//create Pattern object to init a String
        Matcher m = p.matcher("ihateallofyou");//create a matcher object to save the content of input
        boolean b = m.matches();//judge whether the content is the same
        System.out.println(b);
        boolean b1 = Pattern.matches("ihateyou","ihateyou");//judge the content whether is the same
        System.out.println(b1);

    }
}
