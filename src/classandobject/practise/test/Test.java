package classandobject.practise.test;
//this()
/*

    this( ) ��������ͨ������ʹ�ã�ֻ��д�ڹ��췽���С�
    �ڹ��췽����ʹ��ʱ�������ǵ�һ����䡣

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
