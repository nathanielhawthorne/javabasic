package classandobject.practise.method;
/*
06.get方法和set方法 定义一个类该类有一个私有成员变量通过构造方法将其进行赋初值并提供该成员的getXXX()和setXXX()方法
提示假设有private String name;
则有
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
        System.out.println("a和b的值分别是："+a+" "+b);
    }
    public double setA(double a){
        this.a = a;
        return a;
    }
    public double getA(){
        return a;
    }


}
