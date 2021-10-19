package array;

import java.util.Arrays;

//比较数组是否相等
public class arrayequals {
    public static void main(String[]args){
        int[] arry1 = {1,2,3,4,5};
        int[] array2 = {3,6,7,8,2,4};
        int[] array3 = {1,2,3,4,5};
        boolean bool1 = Arrays.equals(arry1,array2);
        boolean bool2 = Arrays.equals(array2,array3);
        boolean bool3 = Arrays.equals(arry1,array3);
        System.out.println(bool1);
        System.out.println(bool2);
        System.out.println(bool3);
    }
}
