package Return;

public class Return {
    double RR(double number1, double number2){
        double sum = 0;
        sum = (number1+number2)/2;
        return sum;
    }
    public static void main(String[]args){
        System.out.println(new Return().RR(23,45));
    }
}
