package regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//obtain the phonenumber from web
public class PhoneNumber {
    public static void main(String[]args){
        String webContent = "my phone number is 18018845783,my father`s phone number" +
                "is 13764971532";
        Pattern p1 = Pattern.compile("(13\\d)\\d{8}|(18\\d)\\d{8}");
        Matcher m1 = p1.matcher(webContent);
        while (m1.find()){
            System.out.println(m1.group());
        }

    }
}
