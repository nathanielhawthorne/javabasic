package inheritanceandpolymorphism.polymorphism.abstractandinterface.excersice.employee;

import java.util.*;

abstract class Employer {
    //定义抽象类作为父类

    String name;//姓名
    String department;//部门
    double salary;//工资
    double bonus;//奖金

    abstract void showSalary();//输出工资的抽象方法
    abstract void showBonus();//输出奖金的抽象方法

}

class BasicEmployee extends Employer {


    BasicEmployee(String n,String d,double s) {

        this.name=n;
        this.department=d;
        this.salary=s;
    }

    void showSalary() {

        System.out.printf("我叫%s,在%s部门，我的工资是%.1f\n",this.name,this.department,this.salary);
    }

    void showBonus() {

        System.out.printf("我是普通员工，没有奖金，加油升级！\n");
    }

}

class GoodEmployee extends Employer {


    GoodEmployee(String n,String d,double s,double b) {

        this.name=n;
        this.department=d;
        this.salary=s;
        this.bonus=b;
    }

    void showSalary() {

        System.out.printf("我叫%s,在%s部门，我的工资是%.1f\n",this.name,this.department,this.salary);
    }

    void showBonus() {

        System.out.printf("我是优秀员工，我的奖金是%.1f\n",this.bonus);
    }

}


public class Main {


    public static void main(String[] args) {

        Scanner cin=new Scanner(System.in);
        Employer e;
        String n1=cin.next();
        String d1=cin.next();
        int s1=cin.nextInt();
        e=new BasicEmployee(n1,d1,s1);
        e.showSalary();
        e.showBonus();

        String n2=cin.next();
        String d2=cin.next();
        int s2=cin.nextInt();
        int b2=cin.nextInt();
        e=new GoodEmployee(n2,d2,s2,b2);
        e.showSalary();
        e.showBonus();
    }

}
