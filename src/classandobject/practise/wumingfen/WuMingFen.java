package classandobject.practise.wumingfen;
/*
07.���췽�������� Ϊ�������ķۡ�дһ����class WuMingFen Ҫ��
1.���������� ����:String theMa �۵ķ���(��) int quantity �Ƿ���� boolean likeSoup
2.дһ�����췽�� �Ա��ڼ򻯳�ʼ������ �� WuMingFen f1 = new WuMingFen(��ţ�⡱,3,true);
3.���ع��췽�� ʹ�ó�ʼ�����̿��Զ����� WuMingFen f2 = new WuMingFen(��ţ�⡱,2);
4.���ʹ��������乹������ķ۶������������롢2���������� WuMingFen f3 = new WuMingFen();
5.дһ����ͨ���� check() ���ڲ鿴���Ƿ����Ҫ�󡣼� ��������������Դ�ӡ�ڿ���̨�ϡ�
-----------------------------------
java���������ϰ��
https://blog.51cto.com/u_15054039/3543932
 */
public class WuMingFen {
    String theMa;
    int quantity;
    boolean likeSoup;

    public WuMingFen(String theMa,int quantity,boolean likeSoup){
        this.theMa = theMa;
        this.quantity = quantity;
        this.likeSoup = likeSoup;
        System.out.println(theMa+" "+quantity+" "+likeSoup);
    }
    public WuMingFen(String theMa,int quantity){
        System.out.println(theMa+" "+quantity);
    }

    String check(){
        if (theMa.equals("������")&&quantity==2&&likeSoup==true){
            return "����Ҫ��";
        }else {
            return "������Ҫ��";
        }

    }
}
