package classandobject.practise.people;
/*
��1������һ������People���ࣺ

���ԣ����������䡢�Ա����

��Ϊ��˵��������ӷ�������

��д��Ϊ�������Ը�ֵ�Ĺ��췽����

��2���������ࣺ

����һ���������С����������Ա��С�������18�꣬���1.80��

�øö�����ó�Ա������

˵������ã���

����23+45��ֵ

�����ָ�Ϊ�����ġ�
 */
public class People {
    public String name;
    public int age;
    public boolean sex =false;
    public double height;
    

    public void speak(){
        System.out.println("���");
    }
    public double caculate(double a,double b){
        return a+b;
    }
    public String changeName(String name){
        return name;
    }
    public People(String name,int age,boolean sex,double height){
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.height = height;
    }

}
