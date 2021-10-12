package mathematicsanddate;
//Java生成随机数（random()和Random类）
import java.util.Random;
public class JavaRandom {
    public static void main(String[]args){
        Random r = new Random();
        double d1 = r.nextDouble();
        double d2 = r.nextDouble()*7;
        int i1 = r.nextInt(10);
        int i2 = r.nextInt(18)-3;
        long l1 = r.nextLong();
        boolean b1 = r.nextBoolean();
        float f1 = r.nextFloat();
        System.out.print(d1+","+d2+","+i1+","+i2+","+l1+","+b1+","+f1);
        //System.out.println("-------------------------------------------");
        for (int n = 1;n<=10;n++){
            int number = r.nextInt(10);
            System.out.println(number);
        }
    }
}
