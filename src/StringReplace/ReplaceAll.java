package StringReplace;
//替换掉所有匹配到的正则表达式
public class ReplaceAll {
    static String str = "hello,world,hello,everyone";
    public static void main(String[]args){
        System.out.println(str.replaceAll("hello","你好"));
    }
}
