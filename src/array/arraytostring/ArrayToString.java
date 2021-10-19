package array.arraytostring;
//数组转换为字符串
public class ArrayToString {
    public static void main(String[]args){
        char[] char1 = {'1','4','d','t'};
        String str = String.copyValueOf(char1);
        System.out.print(str);

        System.out.println();
        String[] arr = {"2432defds","ew3243ff"};
        StringBuffer sb = new StringBuffer();
        for (int n1 = 0;n1<arr.length;n1++){
            sb.append(arr[n1]);
        }
        String sb1 = sb.toString();
        System.out.print(sb1);

    }
}
