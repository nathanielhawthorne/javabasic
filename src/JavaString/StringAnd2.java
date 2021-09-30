package JavaString;

public class StringAnd2 {
    static String str = "三国演义\t";
    public static void main(String[]args){
        str = str.concat("红楼梦"+"\t");
        str = str.concat("水浒传"+"\t");
        str = str.concat("西游记"+"\t");
        System.out.println(str);
        String str2 = "美国\t";
        System.out.println(str2.concat("日本"+"\t").concat("德国\t").concat("波兰\t"));
    }
}
