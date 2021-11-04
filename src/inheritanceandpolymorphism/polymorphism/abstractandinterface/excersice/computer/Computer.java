package inheritanceandpolymorphism.polymorphism.abstractandinterface.excersice.computer;


interface USB{
    void turnOn();
    void turnOff();
}
class Mouse implements USB{
    public void turnOn(){
        System.out.println("鼠标启动了");
    }
    public void turnOff(){
        System.out.println("鼠标关闭了");
    }
}
class KeyBoard implements USB{
    public void turnOn(){
        System.out.println("键盘启动了");
    }
    public void turnOff(){
        System.out.println("键盘关闭了");
    }
}
class Mic implements USB{
    public void turnOn(){
        System.out.println("麦克风启动了");
    }
    public void turnOff(){
        System.out.println("麦克风关闭了");
    }
}
class Computer {
    String[] usbNumber = new String[5];
    void addUSB(){
        for (int n=0;n<usbNumber.length;n++){
            if (usbNumber[n]!=null){

            }
        }
    }
    void powerOn(){
        for (int n = 0;n<usbNumber.length;n++){

        }
    }
}
