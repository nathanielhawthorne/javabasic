package anonymous;
//��������
/*
�����ϳ�����������п��Է��֣�ֱ��ʹ���ˡ�new Person("����",30)����䣬��ʵ���Ͼ���һ����������
��֮ǰ�����Ķ���ͬ���˴�û���κ�ջ�ڴ������������Դ˶���ʹ��һ��֮��͵ȴ��� GC�������ռ����ƣ����ա�

����������ʵ�ʿ����л���������Ϊ������ʵ��������Ĳ������ݵģ��ں���� Java Ӧ�ò��ֵĺܶ�ط������Է������÷���
����ϸ�ĵĶ��߿��Է��֣���������ʵ���Ͼ��Ǹ����ڴ�ռ䣬���󲻹��������Ļ��Ƿ������ģ��������ڿ��ٶѿռ�֮��ſ���ʹ�á�
 */
public class AnonymousObject {
    String name;
    int age;

    public AnonymousObject(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void printInfo(){
        System.out.println("�����ǣ�"+name+" "+"�����ǣ�"+age);
    }

}
