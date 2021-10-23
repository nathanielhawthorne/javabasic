package classandobject.practise;

import java.lang.System.*;
//
public class Callisto {
    public String name;
    public int age;
    public double salary;

    public Callisto(String name,int age,double salary){
        this.age = age;
        this.name = name;
        this.salary = salary;
    }
    public void sleep(){}
    public void eat(){}

    public static void main(String[]args){
        Callisto callisto = new Callisto("xiong",22,4000);
        System.out.println(callisto.name+callisto.age+callisto.salary);

    }
}
