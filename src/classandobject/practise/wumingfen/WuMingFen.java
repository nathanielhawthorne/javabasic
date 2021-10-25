package classandobject.practise.wumingfen;
/*
07.构造方法与重载 为“无名的粉”写一个类class WuMingFen 要求：
1.有三个属性 面码:String theMa 粉的分量(两) int quantity 是否带汤 boolean likeSoup
2.写一个构造方法 以便于简化初始化过程 如 WuMingFen f1 = new WuMingFen(“牛肉”,3,true);
3.重载构造方法 使得初始化过程可以多样化 WuMingFen f2 = new WuMingFen(“牛肉”,2);
4.如何使得下列语句构造出来的粉对象是酸辣面码、2两、带汤的 WuMingFen f3 = new WuMingFen();
5.写一个普通方法 check() 用于查看粉是否符合要求。即 将对象的三个属性打印在控制台上。
-----------------------------------
java面向对象练习题
https://blog.51cto.com/u_15054039/3543932
 */
public class WuMingFen {
    String theMa;
    int quantity;
    boolean likeSoup;

    public WuMingFen(String theMa,int quantity,boolean likeSoup){
        this.theMa = theMa;
        this.quantity = quantity;
        this.likeSoup = likeSoup;
        System.out.println(theMa+" "+quantity+" "+likeSoup);
    }
    public WuMingFen(String theMa,int quantity){
        System.out.println(theMa+" "+quantity);
    }

    String check(){
        if (theMa.equals("酸辣粉")&&quantity==2&&likeSoup==true){
            return "符合要求";
        }else {
            return "不符合要求";
        }

    }
}
