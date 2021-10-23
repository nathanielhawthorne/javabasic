package classandobject.practise;

public class Test05 {
    public static void main(String[]args){
        int n = args.length;
        if (n>0){
            for (int n1 = 0;n1<n;n++){
                System.out.println("第"+n1+"个参数是"+args[n1]);
            }
        }
    }
}
