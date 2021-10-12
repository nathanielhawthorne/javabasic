package mathematicsanddate;
//三角函数运算
public class Trigonometricoperation {
    public static void main(String[]args){
        // 每个方法的参数和返回值都是 double 类型，参数以弧度代替角度来实现，1 度等于 π/180 弧度，因此平角就是 π 弧度。
        System.out.println("a."+Math.sin(Math.PI/2));
        System.out.println("b."+Math.cos(Math.PI/2));
        System.out.println("c."+Math.tan(Math.PI/2));
        System.out.println("d."+Math.asin(1));
        System.out.println("e."+Math.acos(1));
        System.out.println("f."+Math.atan(1));
        System.out.println("g."+Math.toDegrees(1));
        System.out.println("h."+Math.toRadians(120));
    }
}
