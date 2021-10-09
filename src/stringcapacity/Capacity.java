package stringcapacity;
//String容量
public class Capacity {
    static StringBuffer string = new StringBuffer();//定义一个StringBuffer对象，默认容量为16
    static StringBuffer string2 = new StringBuffer(10);//定义一个StringBuffer对象，并把容量设置为10
    static StringBuffer string3 = new StringBuffer("降龙有悔");//定义一个StringBuffer对象，并在默认容量上增加四个字符
    public static void main(String[]args){
        System.out.println(string.capacity());
        System.out.println(string2.capacity());
        System.out.println(string3.capacity());
    }
}
