package classandobject.practise.vehicle;
/*
（1）创建一个叫做机动车的类：

属性：车牌号(String)，车速(int)，载重量(double)

功能：加速(车速自增)、减速(车速自减)、修改车牌号，查询车的载重量。

编写两个构造方法：一个没有形参，在方法中将车牌号设置“XX1234”，速

度设置为100，载重量设置为100；另一个能为对象的所有属性赋值；

（2）创建主类：

在主类中创建两个机动车对象。

创建第一个时调用无参数的构造方法，调用成员方法使其车牌为“辽A9752”，并让其加速。

创建第二个时调用有参数的构造方法，使其车牌为“辽B5086”,车速为150,

载重为200，并让其减速。

输出两辆车的所有信息
 */
public class MotorVehicle {
    public String numberPlate;
    public int speed;
    public double deadweight = 100;

    public int speedUp(){
        return speed++;
    }
    public int speedDown(){
        return speed--;
    }
    public String changeNumberPlate(String numberPlate){
        return numberPlate;
    }
    public double checkDeadWeight(){
        return deadweight;
    }

    public MotorVehicle(String numberPlate){
        this.numberPlate = numberPlate;

    }
    public MotorVehicle(){
        numberPlate = "XX1234";
        speed = 100;
        deadweight = 100;
    }
    public MotorVehicle(String numberPlate,int speed,double deadweight){
        this.numberPlate = numberPlate;
        this.speed = speed;
        this.deadweight = deadweight;
    }



}
