package inheritanceandpolymorphism.polymorphism.abstractandinterface.excersice.commondivisor;

import java.util.Scanner;

class A {

    public int f(int a,int b){
		/*if(b==0)
			return a;
		else
			return f(b,a%b);*/  //不能用递归来写gcd函数
        int t,gcdd = 1;
        if(a<b)
            t=a;
        else t=b;
        for(int i=2;i<=t;i++){
            if(a%i==0 && b%i==0){
                gcdd=i;
                break;
            }
        }
        return gcdd;
    }

}



class B extends A{

    public int f(int a,int b){
        int dd=super.f(a,b);
        int lcm=a*b/dd;
        return lcm;
    }

}

public class Test2 {

    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int a=reader.nextInt();
        int b=reader.nextInt();
        A fuqin=new A();
        B erzi=new B();
        System.out.println(fuqin.f(a,b));
        System.out.println(erzi.f(a,b));
    }
}