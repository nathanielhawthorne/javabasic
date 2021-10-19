package array.arraycopy;

import java.util.Arrays;

//Êý×é¸´ÖÆ
public class ArrayCopy {
    public static void main(String[]args){
        int[] array = {1,4,5,9,3,5,5};
        for (int n = 0;n<array.length;n++){
            System.out.print(array[n]);
        }
        System.out.print("\n");
        int[] newArray =(int[]) Arrays.copyOf(array,10);
        for (int n1 = 0;n1<newArray.length;n1++){
            System.out.print(newArray[n1]);
        }

    }
}
