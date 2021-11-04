package inheritanceandpolymorphism.polymorphism;

class Person {
    public void eat1() {
        System.out.println("�Է�");
    }
}

class SouthPerson extends Person {
    public void eat() {
        System.out.println("����,���׷�");
    }

    public void jingShang() {
        System.out.println("����");
    }
}

class NorthPerson extends Person {
    public void eat() {
        System.out.println("����,����ͷ");
    }

    public void yanJiu() {
        System.out.println("�о�");
    }
}

class DuoTaiTest2 {
    public static void main(String[] args) {
        //����
        //�Ϸ���
        //����ת��Ϊ���ֻ࣬�ܵ��ø��෽��,�����෽����һ����ʱ�򣬵��õ�������ķ�������һ����ʱ��
        // ���õ��Ǹ���ķ���
        Person p = new SouthPerson();
        p.eat1();
        System.out.println("-------------");
        //����ת��Ϊ���࣬����������з�����Ҳ���Ե��ø��෽��
        SouthPerson sp = (SouthPerson)p;
        sp.eat();
        sp.eat1();
        sp.jingShang();
        System.out.println("-------------");

        //������
        p = new NorthPerson();
        p.eat1();
        System.out.println("-------------");
        NorthPerson np = (NorthPerson)p;
        np.eat1();
        np.eat();
        np.yanJiu();
    }
}