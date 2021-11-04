package classandobject.practise.car;
/*
12.构造方法与重载 建立一个汽车类 包括轮胎个数 汽车颜色 车身重量等属性。并通过不同的构造方法创建事例。
至少要求 汽车能够加速 减速 停车。 要求 命名规范 代码体现层次 有友好的操作提示。
 */
public class Car {
    public int tireNumber;
    public String color;
    public double weight;
    public double speed = 100;

    public Car(int tireNumber,String color){
        this.tireNumber = tireNumber;
        this.color = color;
    }
    public Car(double weight){
        this.weight = weight;
    }
    public void printInfo(){
        System.out.println("轮胎个数："+tireNumber+"汽车颜色："+color+"汽车重量："+weight);
    }
    public void addSpeed(double add){
        speed += add;
        System.out.println("加速后的速度为："+speed);
    }
}
