package array.application;
//获取最大最小值
public class MaxAndMin {
    public static void main(String[]args){
        int max = 0;
        int min = 0;
        int[] intArray = {2342,42,654,2341,3453,765,97,2,66,865,8,3432,6545,75,3,645,67,3,65,1,0,5452};
        max = min = intArray[0];
        for (int n = 0;n<intArray.length;n++){
            if (intArray[n]>max){
                max = intArray[n];
            }
            if (intArray[n]<min){
                min = intArray[n];
            }
        }
        System.out.print(max+" ");
        System.out.print(min);
    }
}
