package wrapper.print;

import java.io.IOException;

public class Print {
    public static void main(String[]args){
        System.out.println("ÇëÊäÈëÄãµÄÊı×Ö£º");
        int n;
        try {
            n = System.in.read();
            while (n!='r'){
                System.out.print((char)n);
                n = System.in.read();
            }
        }catch (IOException e){
            System.out.print(e.toString());

        }finally {
            System.err.println();

        }

    }
}
