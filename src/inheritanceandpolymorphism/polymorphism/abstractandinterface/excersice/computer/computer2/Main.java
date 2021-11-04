package inheritanceandpolymorphism.polymorphism.abstractandinterface.excersice.computer.computer2;

import java.util.*;

interface USB {
    //����ӿ�
    void turnOn();
    void turnOff();
}

class Mouse implements USB {


    final String name="���";

    public String getName() {

        return this.name;
    }

    public void turnOn() {

        System.out.printf("%s������\n",getName());
    }

    public void turnOff() {

        System.out.printf("%s�ر���\n",getName());

    }

}

class KeyBoard implements USB {


    final String name="����";

    public String getName() {

        return this.name;
    }

    public void turnOn() {

        System.out.printf("%s������\n",getName());
    }

    public void turnOff() {

        System.out.printf("%s�ر���\n",getName());

    }

}

class Mic implements USB {


    final String name="���";

    public String getName() {

        return this.name;
    }

    public void turnOn() {

        System.out.printf("%s������\n",getName());
    }

    public void turnOff() {

        System.out.printf("%s�ر���\n",getName());

    }

}

class Computer {


    USB usb[]=new USB[10];//����USB�ӿ�����
    int number;

    public void add(USB u) {

        usb[++number]=u;
    }

    public void powerOn() {

        for(USB u:usb) {

            if(u!=null)u.turnOn();
        }
        System.out.printf("����������ɹ�\n");
    }

    public void powerOff() {

        for(USB u:usb) {

            if(u!=null)u.turnOff();
        }
        System.out.printf("������ػ��ɹ�\n");
    }

}

public class Main {


    public static void main(String[] args) {

        Computer c=new Computer();
        c.add(new Mouse());
        c.add(new KeyBoard());
        c.add(new Mic());
        c.powerOn();
        c.powerOff();
    }

}
