package classandobject.practise.jidongche;

public class Ceshi_jidongche {

    public static void main(String[] args) {
        Jidongche jd=new Jidongche ();
        jd.setNumber("XX1234");
        System.out.println("���ƺ��ǣ�"+jd.getNumber());

        jd.setLoad(100);
        System.out.println("�����ǣ�"+jd.getLoad());

        jd.setSpeed(100);
        System.out.println("�����ǣ�"+jd.getSpeed());
        System.out.println("������1�ĳ����ǣ�"+jd.getNumber()+"���أ�"+jd.getLoad()+"���٣�"+jd.getSpeed());
        //�����޲����Ĺ��췽��
        jd.setNumber("��A9752");
        System.out.println("�޸ĳ��ƺ��ǣ�"+jd.getNumber());
        System.out.println("���ٺ�Ϊ��"+jd.addSpeed(20));

        //�в�����

        Jidongche jd2=new Jidongche ("��B5086", 150, 200);
        jd2.Xinxi("��B5086", 150, 200);
        System.out.println("���ٺ�Ϊ��"+jd2.downSpeed(20));


    }

}