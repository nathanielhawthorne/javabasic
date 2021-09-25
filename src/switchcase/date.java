package switchcase;

import java.util.Calendar;

public class date {
    public static void main(String[]args){
        Calendar canlendar = Calendar.getInstance();
        System.out.println(canlendar);
        int week = canlendar.get(Calendar.DAY_OF_WEEK)-1;
        System.out.println("今天是星期"+week);
    }
}
