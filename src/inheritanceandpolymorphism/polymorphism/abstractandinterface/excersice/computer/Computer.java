package inheritanceandpolymorphism.polymorphism.abstractandinterface.excersice.computer;


interface USB{
    void turnOn();
    void turnOff();
}
class Mouse implements USB{
    public void turnOn(){
        System.out.println("���������");
    }
    public void turnOff(){
        System.out.println("���ر���");
    }
}
class KeyBoard implements USB{
    public void turnOn(){
        System.out.println("����������");
    }
    public void turnOff(){
        System.out.println("���̹ر���");
    }
}
class Mic implements USB{
    public void turnOn(){
        System.out.println("��˷�������");
    }
    public void turnOff(){
        System.out.println("��˷�ر���");
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
