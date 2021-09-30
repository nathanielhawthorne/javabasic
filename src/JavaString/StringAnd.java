package JavaString;

public class StringAnd {
    static String names[] = {"xiong","cao","lv"};
    static String age[] = {"25","24","18"};
    static String job[] = {"engineer","Takeaway","student"};
    public static void main(String[]args){
        for (int number = 0 ;number<=2;number++){
            System.out.println("姓名："+names[number]+"\t"+"年龄："+age[number]+"\t"+"工作："+job[number]);
        }
    }
}


//String str = "fsdfsf"+"dsfdfsgdsfgfds"+"efergesgsd"+"dsfsdgfdsgfd";