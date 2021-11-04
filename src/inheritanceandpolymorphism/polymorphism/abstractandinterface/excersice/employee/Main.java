package inheritanceandpolymorphism.polymorphism.abstractandinterface.excersice.employee;

import java.util.*;

abstract class Employer {
    //�����������Ϊ����

    String name;//����
    String department;//����
    double salary;//����
    double bonus;//����

    abstract void showSalary();//������ʵĳ��󷽷�
    abstract void showBonus();//�������ĳ��󷽷�

}

class BasicEmployee extends Employer {


    BasicEmployee(String n,String d,double s) {

        this.name=n;
        this.department=d;
        this.salary=s;
    }

    void showSalary() {

        System.out.printf("�ҽ�%s,��%s���ţ��ҵĹ�����%.1f\n",this.name,this.department,this.salary);
    }

    void showBonus() {

        System.out.printf("������ͨԱ����û�н��𣬼���������\n");
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

        System.out.printf("�ҽ�%s,��%s���ţ��ҵĹ�����%.1f\n",this.name,this.department,this.salary);
    }

    void showBonus() {

        System.out.printf("��������Ա�����ҵĽ�����%.1f\n",this.bonus);
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
