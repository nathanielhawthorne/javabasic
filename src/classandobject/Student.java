package classandobject;

public class Student {
    //学生类
    public String Name;
    public int Age;
    private boolean Sex;

    public boolean isSex(){
        return Sex;
    }
    public void setSex(boolean sex){
        this.Sex = Sex;
    }//this指的是方法所属的类的对象的引用。

    public static void main(String[] args) {
        Student zhang = new Student(); // 创建第一个实例
        zhang.Name = "张子同";
        String isMan = zhang.isSex() ? "女" : "男";
        System.out.println("姓名：" + zhang.Name + " "+"性别：" + isMan + " "+"年龄：" + zhang.Age);
        Student li = new Student(); // 创建第二个实例
        li.Name = "李子文";
        li.Sex = true;
        li.Age = 15;
        String isWoman = li.isSex() ? "女" : "男";
        System.out.println("姓名：" + li.Name + " "+"性别：" + isWoman +" "+ "年龄：" + li.Age);
    }
}
