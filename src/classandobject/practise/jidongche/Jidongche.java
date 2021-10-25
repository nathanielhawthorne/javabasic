package classandobject.practise.jidongche;

public class Jidongche
{
    private String number;//车牌
    private int  speed;//车速
    private double load;//载重
    private String xinxi;
    //无参有返回值
    public String getNumber() {
        return number;
    }                               //创造成员方法，获取车牌号
    public void setNumber(String number) {
        this.number = number;         //创造成员方法，设置车牌号
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public double getLoad() {
        return load;
    }
    public void setLoad(double load) {
        this.load = load;
    }
    public double addSpeed(int sd)
    {
        speed+=sd;
        return speed;
    }
    public int downSpeed(int sd)
    {
        speed-=sd;
        return speed;
    }        //构造方法
    Jidongche()
    {
        number="XX1234";
        speed=100;
        load=100;
    }

    Jidongche(String number,int  speed,double load)
    {
        this.number=number;
        this.speed=speed;
        this.load=load;
    }

    //有参无返回值
    void Xinxi(String n,int  s,double l)
    {
        xinxi=n+s+l;
        System.out.println("机动车2的车牌号是："+n+"车速："+s+"载重："+l);
    }

}