package classandobject.practise.jidongche;

public class Jidongche
{
    private String number;//����
    private int  speed;//����
    private double load;//����
    private String xinxi;
    //�޲��з���ֵ
    public String getNumber() {
        return number;
    }                               //�����Ա��������ȡ���ƺ�
    public void setNumber(String number) {
        this.number = number;         //�����Ա���������ó��ƺ�
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
    }        //���췽��
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

    //�в��޷���ֵ
    void Xinxi(String n,int  s,double l)
    {
        xinxi=n+s+l;
        System.out.println("������2�ĳ��ƺ��ǣ�"+n+"���٣�"+s+"���أ�"+l);
    }

}