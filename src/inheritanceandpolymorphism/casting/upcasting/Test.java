package inheritanceandpolymorphism.casting.upcasting;

public class Test {
    public static void main(String[]args){
        //����ת��
        System.out.println("����������ת�ͽ����");
        Father father = new Son("jin",25,false,"none","program");
        father.age = 30;
        //����ת��Ϊ���࣬�޷���������ı���
        //ֻ�ܵ��ø���ķ���
        father.work();
        father.workTrip();
        System.out.println(father);
        //����ת��
        System.out.println("����������ת�ͽ����");
        Son son = (Son)father;
        //��ֱ�ӵ�������ı���
        son.depart = "network";
        son.school = "peking university";
        //�ɵ�������ķ���
        son.eat();
        son.sleep();
        System.out.println(son);
    }
}
