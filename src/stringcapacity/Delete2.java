package stringcapacity;
//删除一定范围内的StringBuffer的内容
public class Delete2 {
    public static void main(String[]args){
        StringBuffer content = new StringBuffer("hello!world!");
        content.delete(0,2);
        System.out.println(content);
        content.delete(0,2);
        System.out.println(content);
    }
}
