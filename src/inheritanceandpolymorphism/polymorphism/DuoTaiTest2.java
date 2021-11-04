package inheritanceandpolymorphism.polymorphism;

class Person {
    public void eat1() {
        System.out.println("吃饭");
    }
}

class SouthPerson extends Person {
    public void eat() {
        System.out.println("炒菜,吃米饭");
    }

    public void jingShang() {
        System.out.println("经商");
    }
}

class NorthPerson extends Person {
    public void eat() {
        System.out.println("炖菜,吃馒头");
    }

    public void yanJiu() {
        System.out.println("研究");
    }
}

class DuoTaiTest2 {
    public static void main(String[] args) {
        //测试
        //南方人
        //向上转型为父类，只能调用父类方法,父子类方法名一样的时候，调用的是子类的方法，不一样的时候，
        // 调用的是父类的方法
        Person p = new SouthPerson();
        p.eat1();
        System.out.println("-------------");
        //向下转型为子类，调用子类独有方法，也可以调用父类方法
        SouthPerson sp = (SouthPerson)p;
        sp.eat();
        sp.eat1();
        sp.jingShang();
        System.out.println("-------------");

        //北方人
        p = new NorthPerson();
        p.eat1();
        System.out.println("-------------");
        NorthPerson np = (NorthPerson)p;
        np.eat1();
        np.eat();
        np.yanJiu();
    }
}