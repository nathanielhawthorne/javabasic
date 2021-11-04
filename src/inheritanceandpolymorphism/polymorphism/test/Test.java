/*

����ת�Ϳ��Ե����������������еĳ�Ա��������Ҫע���������������ö���ָ������������
��ô������ת�͵Ĺ������ǰ�ȫ�ģ�Ҳ���Ǳ����ǲ�������󡣵�������������ö����Ǹ��౾��
��ô������ת�͵Ĺ������ǲ���ȫ�ģ����벻�������������ʱ��������ǿ�ʼ�ᵽ�� Java ǿ������ת���쳣��
һ��ʹ�� instanceof �������������������

 */

package inheritanceandpolymorphism.polymorphism.test;
class Livestock{
    void eat(){System.out.println("����Բ�");}
    void sleep(){System.out.println("����˯��");}
}
class Cattle extends Livestock {
    void eat(){
        System.out.println("ţ�Բ�");
    }
    void sleep(){
        System.out.println("ţ˯��");
    }
}
class Sheep extends Livestock{
    void eat(){System.out.println("��Բ�");}
    void sleep(){System.out.println("��˯��");}
}

public class Test {
    public static void main(String[]args){
        //����Ϊţ�࣬�ɱ�Ϊ�����࣬��ֻ�ܱ���ԭΪţ��
        Livestock livestock = new Cattle();
        livestock.eat();
        livestock.sleep();
        //��ԭΪţ�࣬����ת�ͣ��ɵ���ţ�����Է���
        System.out.println("---------------------------------------");
        Cattle cattle = (Cattle)livestock;
        livestock.eat();
        livestock.sleep();
        System.out.println("---------------------------------------");
        //�������
        livestock = new Sheep();
        livestock.eat();
        livestock.sleep();
        System.out.println("---------------------------------------");
        //��ɼ�����
        livestock = new Livestock();
        livestock.eat();
        livestock.sleep();
        /*

        //��ԭΪţ��
        Cattle cattle1 = (Cattle)livestock;
        cattle1.eat();
        cattle1.sleep();

         */
        System.out.println("---------------------------------------");
        //��Ϊţ��
        livestock = new Cattle();
        livestock.eat();
        livestock.sleep();
        System.out.println("---------------------------------------");
        //��ԭΪţ��
        Cattle cattle1 = (Cattle)livestock;
        cattle1.eat();
        cattle1.sleep();
        System.out.println("---------------------------------------");
        //����һ������
        System.out.println("����һ������");
        Livestock livestock1 = new Sheep();
        livestock1.eat();
        livestock1.sleep();
        //���ţ��
        livestock1 = new Cattle();
        livestock1.eat();
        livestock1.sleep();
        //��ɼ�����
        livestock1 = new Livestock();
        livestock1.eat();
        livestock1.sleep();
        //��ԭΪ����
        Livestock livestock2 = (Livestock)livestock1;
        livestock2.eat();
        livestock2.sleep();
        /*
        //����ʾ����ֻ�ܻ�ԭΪ�Լ���Ӧ����
        Sheep sheep = (Sheep) livestock1;
        sheep.eat();
        sheep.sleep();
        //����ʾ������ԭΪţ��
        Cattle cattle2 = (Cattle)livestock1;
        cattle2.eat();
        cattle2.sleep();

         */

    }
}
