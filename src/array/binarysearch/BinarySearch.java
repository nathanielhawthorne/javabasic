package array.binarysearch;

import java.util.Arrays;

//使用二分法查找指定值并返回索引
public class BinarySearch {
    public static void main(String[]args){
        int[] number = {433,23,454,54,231,43,4543,45,35,656,2321,45,53,43,645,564,34453,64,34};
        Arrays.sort(number);
        int index1 = Arrays.binarySearch(number,35);
        int index2 = Arrays.binarySearch(number,34);
        System.out.println(index1);
        System.out.println(index2);
        int index3 = Arrays.binarySearch(number,2,5,23);
        int index4 = Arrays.binarySearch(number,3,7,65);
        System.out.println(index3+index4);
    }
}
