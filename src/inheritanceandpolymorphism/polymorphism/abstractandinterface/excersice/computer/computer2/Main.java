package inheritanceandpolymorphism.polymorphism.abstractandinterface.excersice.computer.computer2;

import java.util.*;

interface USB {
    //定义接口
    void turnOn();
    void turnOff();
}

class Mouse implements USB {


    final String name="鼠标";

    public String getName() {

        return this.name;
    }

    public void turnOn() {

        System.out.printf("%s启动了\n",getName());
    }

    public void turnOff() {

        System.out.printf("%s关闭了\n",getName());

    }

}

class KeyBoard implements USB {


    final String name="键盘";

    public String getName() {

        return this.name;
    }

    public void turnOn() {

        System.out.printf("%s启动了\n",getName());
    }

    public void turnOff() {

        System.out.printf("%s关闭了\n",getName());

    }

}

class Mic implements USB {


    final String name="麦克";

    public String getName() {

        return this.name;
    }

    public void turnOn() {

        System.out.printf("%s启动了\n",getName());
    }

    public void turnOff() {

        System.out.printf("%s关闭了\n",getName());

    }

}

class Computer {


    USB usb[]=new USB[10];//定义USB接口数组
    int number;

    public void add(USB u) {

        usb[++number]=u;
    }

    public void powerOn() {

        for(USB u:usb) {

            if(u!=null)u.turnOn();
        }
        System.out.printf("计算机开机成功\n");
    }

    public void powerOff() {

        for(USB u:usb) {

            if(u!=null)u.turnOff();
        }
        System.out.printf("计算机关机成功\n");
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
