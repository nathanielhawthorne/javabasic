package array.arraycopy;
//array copy方法
public class JavaArrayCopy {
    public static void main(String[]args){
        int[] number = {1,3,5,6,5,2,5,6,7,3,5,46,32,345,645,353,63};
        for (int n = 0;n<number.length;n++){
            System.out.print(number[n]+"\t");
        }
        System.out.print("\n");
        int[] newNumber = {432,434,453,342,2244,53,432,456,765,86,131,567,8768,344,234,3245,543,242,4353,64,34};
        System.out.print("原\n");
        for (int n1 = 0;n1<newNumber.length;n1++){
            System.out.print(newNumber[n1]+"\t");
        }
        System.out.print("\n");
        System.arraycopy(number,0,newNumber,2,number.length);
        System.out.print("替换后：\n");
        for (int n2 = 0;n2<newNumber.length;n2++){
            System.out.print(newNumber[n2]+"\t");
        }
    }
}
