package stringcapacity;
//ɾ��StringBuffer
public class Delete {
    public static void main(String[]args){
        StringBuffer content = new StringBuffer("java");
        content.deleteCharAt(0);
        System.out.println(content);
    }
}
