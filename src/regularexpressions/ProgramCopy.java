package regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProgramCopy {
    public static void main(String[]args){
        String str = "i love go to the school";
        Pattern p = Pattern.compile("\\w+");
        Matcher m = p.matcher(str);
        while (m.find()){
            System.out.println(m.group()+"子字符串起始位置："+m.start()+"结束位置是"+m.end());
        }
    }
}
