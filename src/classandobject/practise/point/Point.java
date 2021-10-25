package classandobject.practise.point;
/*
4、创建一个Point类，有成员变量x，y，方法getX(),setX()，还有一个构造方

法初始化x和y。创建类主类A来测试它。
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
        System.out.println("x的值是："+" "+j+"y的值是："+k);
    }
}
