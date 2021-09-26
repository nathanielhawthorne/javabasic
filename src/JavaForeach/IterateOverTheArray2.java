package JavaForeach;
//使用for each遍历数组
public class IterateOverTheArray2 {
    public static void main(String[]args){
        int [] numbers = {45,23,89,10,36,27,49,17,20,33,10};
        for (int item : numbers){   //将数组每一个元素存储在item中
            System.out.println(item);
        }
    }
}
