package classandobject.practise.vehicle;
/*
��1������һ���������������ࣺ

���ԣ����ƺ�(String)������(int)��������(double)

���ܣ�����(��������)������(�����Լ�)���޸ĳ��ƺţ���ѯ������������

��д�������췽����һ��û���βΣ��ڷ����н����ƺ����á�XX1234������

������Ϊ100������������Ϊ100����һ����Ϊ������������Ը�ֵ��

��2���������ࣺ

�������д�����������������

������һ��ʱ�����޲����Ĺ��췽�������ó�Ա����ʹ�䳵��Ϊ����A9752������������١�

�����ڶ���ʱ�����в����Ĺ��췽����ʹ�䳵��Ϊ����B5086��,����Ϊ150,

����Ϊ200����������١�

�����������������Ϣ
 */
public class MotorVehicle {
    public String numberPlate;
    public int speed;
    public double deadweight = 100;

    public int speedUp(){
        return speed++;
    }
    public int speedDown(){
        return speed--;
    }
    public String changeNumberPlate(String numberPlate){
        return numberPlate;
    }
    public double checkDeadWeight(){
        return deadweight;
    }

    public MotorVehicle(String numberPlate){
        this.numberPlate = numberPlate;

    }
    public MotorVehicle(){
        numberPlate = "XX1234";
        speed = 100;
        deadweight = 100;
    }
    public MotorVehicle(String numberPlate,int speed,double deadweight){
        this.numberPlate = numberPlate;
        this.speed = speed;
        this.deadweight = deadweight;
    }



}
