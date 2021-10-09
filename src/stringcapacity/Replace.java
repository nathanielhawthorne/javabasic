package stringcapacity;
//StringBuffer替换字符
public class Replace {
    public static void main(String[]args){
        StringBuffer content = new StringBuffer("电子厂的底层贱民");
        System.out.println(content);
        content.setCharAt(0,'袜');
        System.out.println(content);
        content.setCharAt(7,'人');
        System.out.println(content);
    }
}
