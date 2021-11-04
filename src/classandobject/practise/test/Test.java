package classandobject.practise.test;
//this()
/*

    this( ) 不能在普通方法中使用，只能写在构造方法中。
    在构造方法中使用时，必须是第一条语句。

 */
public class Test {
    String name;
    public Test(){
        this("sdsdfdsfds");
    }
    public Test(String name){
        this.name = name;
    }
    public void print(){
        System.out.println(name);
    }

}
