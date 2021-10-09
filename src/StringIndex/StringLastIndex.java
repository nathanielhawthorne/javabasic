package StringIndex;
//查找字符串最后一次出现的位置
public class StringLastIndex {
    static String str = "hello,world!";
    public static void main(String[]args){
        System.out.println(str.lastIndexOf("l"));
        System.out.println(str.lastIndexOf("l",4));
        //返回指定字符在此字符串中最后一次出现处的索引，以指定的索引处为截止点，进行正向搜索，
        // 并输出指定字符对应的正向索引值，如果此字符串中没有这样的字符，则返回 -1。
        System.out.println(str.lastIndexOf("l",5));
        System.out.println(str.lastIndexOf("l",6));
        System.out.println(str.lastIndexOf("l",1));
        System.out.println(str.lastIndexOf("l",10));
    }
}
