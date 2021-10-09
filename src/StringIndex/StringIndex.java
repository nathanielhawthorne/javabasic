package StringIndex;
//String按照索引查找字符串，找到第一个字符串后输出对应索引
public class StringIndex {
    static String str = "hello,world!";
    public static void main(String[]args){
        System.out.println(str.indexOf("l"));
        System.out.println(str.indexOf("l",5));
    }
}
