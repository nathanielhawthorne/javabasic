package stringcapacity;
//StringBuffer��׷�ӷ�ʽ
public class Append {
    static StringBuffer firstStringBuffer = new StringBuffer("hello!");
    public static void main(String[]args){
        StringBuffer secondStringBuffer = new StringBuffer("world!");
        firstStringBuffer.append(secondStringBuffer);
        //System.out.println(firstStringBuffer.append(secondStringBuffer));
        System.out.println(firstStringBuffer.substring(0));
    }

}
