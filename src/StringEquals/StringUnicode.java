package StringEquals;
//比较字符串的先后顺序,Java String compareTo()方法用于按字典顺序比较两个字符串。
// 两个字符串的每个字符都转换为 Unicode 值以进行比较。
// 如果两个字符串都相等，则此方法返回 0，否则返回正值或负值。
// 如果第一个字符串按字典顺序大于第二个字符串，则结果为正，否则结果为负。
public class StringUnicode {
    static String str1 = "jd";
    static String str2 = "la";
    public static void main(String[]args){
        System.out.println(str1.compareTo(str2));
    }
}
