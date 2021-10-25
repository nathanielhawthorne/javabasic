package classandobject.practise.jidongche;

public class Ceshi_jidongche {

    public static void main(String[] args) {
        Jidongche jd=new Jidongche ();
        jd.setNumber("XX1234");
        System.out.println("车牌号是："+jd.getNumber());

        jd.setLoad(100);
        System.out.println("载重是："+jd.getLoad());

        jd.setSpeed(100);
        System.out.println("车速是："+jd.getSpeed());
        System.out.println("机动车1的车牌是："+jd.getNumber()+"载重："+jd.getLoad()+"车速："+jd.getSpeed());
        //调用无参数的构造方法
        jd.setNumber("辽A9752");
        System.out.println("修改车牌号是："+jd.getNumber());
        System.out.println("加速后为："+jd.addSpeed(20));

        //有参数的

        Jidongche jd2=new Jidongche ("辽B5086", 150, 200);
        jd2.Xinxi("辽B5086", 150, 200);
        System.out.println("减速后为："+jd2.downSpeed(20));


    }

}