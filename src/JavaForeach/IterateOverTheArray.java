package JavaForeach;
//用for遍历数组
public class IterateOverTheArray {
    public static void main(String[]args){
        int [] numbers = {23,34,56,73,56,16,89,46,38};
        for (int number1 = 0;number1<=numbers.length-1;number1++){
            System.out.println(numbers[number1]);
        }
    }
}
