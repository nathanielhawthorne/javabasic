package classandobject.practise.vehicles;
/*
08.���췽�������� ,����һ����ΪVehicles ��ͨ���� �Ļ��� ��������Ӧ����String���͵ĳ�Ա����brand �̱� ��
��color ��ɫ ����Ӧ������Ա����run ��ʻ ���ڿ���̨��ʾ�����Ѿ������ˡ� ��showInfo ��ʾ��Ϣ ��
�ڿ���̨��ʾ�̱����ɫ ����д���췽����ʼ�����Ա���ԡ� ��дCar С���� ��̳���Vehicles�࣬
����int�ͳ�Ա����seats ��λ ����Ӧ���ӳ�Ա����showCar �ڿ���̨��ʾС��������Ϣ�� ����д���췽����
��дTruck ���� ��̳���Vehicles�� ������float�ͳ�Ա����load ���� ����Ӧ���ӳ�Ա����showTruck
�ڿ���̨��ʾ��������Ϣ ������д���췽���� ��main�����в������ϸ��ࡣ
-----------------------------------
java���������ϰ��
https://blog.51cto.com/u_15054039/3543932
 */
public class Vehicles {
    String brand;
    String color;

    public void run(){
        System.out.println("��Ӧ��������");
    }

    public Vehicles(String brand,String color){
        this.brand = brand;
        this.color = color;
    }
    public String showInfo(){
        return "����Ʒ���ǣ�"+brand+" "+"������ɫ�ǣ�"+color;
    }

    int seats;
    public String showCar(){
        return "С������Ʒ���ǣ�"+brand+"С��������ɫ�ǣ�"+color;
    }

    float load;
    public String showTruck(){
        return "����������Ϊ��"+load+"��������ɫΪ:"+color;
    }


}
