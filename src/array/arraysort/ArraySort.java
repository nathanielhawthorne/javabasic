package array.arraysort;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

//数组排序
public class ArraySort {
    public static void main(String[]args){
        System.out.print("原数组为：\n");
        int[] array = {132,3534,312,645,765,321,645,86,3242,645,446545,8890,8,54,234,4235,8765,45643,435};
        for (int n = 0;n<array.length;n++){
            System.out.print(array[n]+" ");
        }
        Arrays.sort(array);
        System.out.print("\n排序后的数组为：\n");
        for (int n1 = 0;n1<array.length;n1++){
            System.out.print(array[n1]+" ");
        }
        System.out.print("\n\n");

        Integer[] array2 = {2,5,57,464,242,657,343,75,3242,75,876,34,645,76,7};
        System.out.print("\n降序排列后的数组：\n");
        Arrays.sort(array2, Collections.reverseOrder());
        for (int n3 = 0;n3<array2.length;n3++){
            System.out.print(array2[n3]+" ");
        }

    }
}
