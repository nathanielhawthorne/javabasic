package array.filling;

import java.util.Arrays;

//Êı×éÌî³ä
public class Filling {
    public static void main(String[]args){
        int[] number = new int[5];
        for (int n = 0;n<number.length;n++){
            Arrays.fill(number,n);
            System.out.println(number[n]);
        }

    }
}
