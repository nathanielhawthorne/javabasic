package classandobject.practise.area;
//定义一个Circle类，包含一个double类型的radius属性代表圆的半径，findArea()方法返回圆的面积。
public class Circle {
    public double radius;

    public double area(){
        return Math.PI*radius*radius;
    }
    public Circle(int radius){
        System.out.println("圆的面积为："+Math.PI*radius*radius);
    }

}
