package Break;

public class Lable {
    public static void main(String[]args){
        lable : for (int number = 1;number<=10;number++){
            for (int number2 = 1;number2<=10;number2++){
                if (number2==2){
                    break lable;
                }
                System.out.println("number2的值为："+number2);
            }
            System.out.println("number的值为："+number);
        }
    }
}
