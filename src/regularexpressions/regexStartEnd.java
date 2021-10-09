package regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//找出对应字符串的起始和结束位置
public class regexStartEnd {
    public static void main(String[]args){
        String content = "hello my best dark friend my precious";

        Matcher m = Pattern.compile("\\w+").matcher(content);
        while (m.find()){
            System.out.println(m.group() +"的字串开始位置为：" +m.start()+"其结束位置为：" + m.end());
        }
    }
}
