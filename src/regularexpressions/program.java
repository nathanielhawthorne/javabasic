package regularexpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//正则表达式的应用，太草了，喝多了，搁置，继续搞，以后都不要在喝酒了，戒酒
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
