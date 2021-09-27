package Continue;

public class ContinueLable {
    public static void main(String[]args){
        lable : for (int number3 = 1;number3<=10;number3++){
            for (int number4 = 1;number4<=10;number4++){
                if (number3==3){
                    continue lable;
                }
                System.out.println(number3+","+number4);
            }
        }
    }
}
