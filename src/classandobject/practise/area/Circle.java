package classandobject.practise.area;
//����һ��Circle�࣬����һ��double���͵�radius���Դ���Բ�İ뾶��findArea()��������Բ�������
public class Circle {
    public double radius;

    public double area(){
        return Math.PI*radius*radius;
    }
    public Circle(int radius){
        System.out.println("Բ�����Ϊ��"+Math.PI*radius*radius);
    }

}
