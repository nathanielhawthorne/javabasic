package classandobject;

public class Student {
    //ѧ����
    public String Name;
    public int Age;
    private boolean Sex;

    public boolean isSex(){
        return Sex;
    }
    public void setSex(boolean sex){
        this.Sex = Sex;
    }//thisָ���Ƿ�����������Ķ�������á�

    public static void main(String[] args) {
        Student zhang = new Student(); // ������һ��ʵ��
        zhang.Name = "����ͬ";
        String isMan = zhang.isSex() ? "Ů" : "��";
        System.out.println("������" + zhang.Name + " "+"�Ա�" + isMan + " "+"���䣺" + zhang.Age);
        Student li = new Student(); // �����ڶ���ʵ��
        li.Name = "������";
        li.Sex = true;
        li.Age = 15;
        String isWoman = li.isSex() ? "Ů" : "��";
        System.out.println("������" + li.Name + " "+"�Ա�" + isWoman +" "+ "���䣺" + li.Age);
    }
}
