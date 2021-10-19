package array.arraycopy;
//数组克隆
public class ArrayClone {
    public static void main(String[]args){
        System.out.print("原数组：\n");
        int[] number = {232,32423,535,653,231,53,768,97,9,3234,4234,435,6567,76,453,5435,765,765};
        for (int n = 0;n<number.length;n++){
            System.out.print(number[n]+"\t");
        }
        System.out.print("\n克隆后的数组：\n");
        int[] newNumber = (int[])number.clone();
        for (int n1 = 0;n1<newNumber.length;n1++){
            System.out.print(newNumber[n1]+"\t");
        }
    }
}
