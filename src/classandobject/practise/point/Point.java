package classandobject.practise.point;
/*
4������һ��Point�࣬�г�Ա����x��y������getX(),setX()������һ�����췽

����ʼ��x��y������������A����������
 */
public class Point {
    public int x;
    public int y;

    public int getX(){
        return x;
    }
    public int setX(int x){
        this.x = x;
        return x;
    }
    public int getY(){
        return y;
    }
    public int setY(int y){
        this.y = y;
        return y;
    }

    Point(int x,int y){
        x = 0;
        y = 0;
    }
    void total(int j,int k){
        System.out.println("x��ֵ�ǣ�"+" "+j+"y��ֵ�ǣ�"+k);
    }
}
