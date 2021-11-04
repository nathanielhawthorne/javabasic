package classandobject.practise.car;
/*
12.���췽�������� ����һ�������� ������̥���� ������ɫ �������������ԡ���ͨ����ͬ�Ĺ��췽������������
����Ҫ�� �����ܹ����� ���� ͣ���� Ҫ�� �����淶 �������ֲ�� ���ѺõĲ�����ʾ��
 */
public class Car {
    public int tireNumber;
    public String color;
    public double weight;
    public double speed = 100;

    public Car(int tireNumber,String color){
        this.tireNumber = tireNumber;
        this.color = color;
    }
    public Car(double weight){
        this.weight = weight;
    }
    public void printInfo(){
        System.out.println("��̥������"+tireNumber+"������ɫ��"+color+"����������"+weight);
    }
    public void addSpeed(double add){
        speed += add;
        System.out.println("���ٺ���ٶ�Ϊ��"+speed);
    }
}
