package inheritanceandpolymorphism.inheritance.superkeyword.fatherson;

public class Son extends Father {
    double height;
    double weight;

    Son(String name,int age,double height,double weight){
        super(name, age);
        this.height = height;
        this.weight = weight;
    }
    public String toString(){
        return "儿子的名字："+name+" "+"儿子的年龄："+age+" "+"儿子的身高"+height+" "+"儿子的体重"+weight;
    }
}
