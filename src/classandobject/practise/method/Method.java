package classandobject.practise.method;
/*
06.get������set���� ����һ���������һ��˽�г�Ա����ͨ�����췽��������и���ֵ���ṩ�ó�Ա��getXXX()��setXXX()����
��ʾ������private String name;
����
public void setName(String name){
    this.name = name;
}
public String getName(){
    return this.name;
}
 */
public class Method {
    public double a;
    public double b;

    public Method(double a,double b){
        System.out.println("a��b��ֵ�ֱ��ǣ�"+a+" "+b);
    }
    public double setA(double a){
        this.a = a;
        return a;
    }
    public double getA(){
        return a;
    }


}
