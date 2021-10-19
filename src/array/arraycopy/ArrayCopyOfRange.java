package array.arraycopy;

import java.util.Arrays;

//复制一定范围的数组
public class ArrayCopyOfRange {
    public static void main(String[]args){
        int[] number = {1,4,3,9,0,2,4,8,5,0,3,4,5,6};
        for (int n = 0;n<number.length;n++){
            System.out.print(number[n]);
        }
        System.out.print("\n");
        int[] newNumber = (int[]) Arrays.copyOfRange(number,0,5);
        for (int n1 = 0;n1<newNumber.length;n1++){
            System.out.print(newNumber[n1]);
        }
    }
}
