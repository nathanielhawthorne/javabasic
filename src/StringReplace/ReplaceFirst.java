package StringReplace;
//字符串替换，替换掉第一个匹配到的正则表达式
public class ReplaceFirst {
    static String str = "hello,world,hello,everyone";
    public static void main(String[]args){
        System.out.println(str.replaceFirst("hello","你好"));
    }
}
