package classandobject.practise;
//����һ���������࣬��Ա�������ߣ��������ܳ�������������A����������
public class Triangle {
    public double side1 = 1;
    public double side2 = 3;
    public double side3 = 5;
    public double perimeter = side1+side2+side3;

    public Triangle(double side1,double side2,double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public Triangle(){

    }
    public double perimeter(){
        return perimeter;
    }
    public static void main(String[]args){
        Triangle triangle = new Triangle(10,20,30);
        System.out.println(triangle.perimeter());
    }
}
