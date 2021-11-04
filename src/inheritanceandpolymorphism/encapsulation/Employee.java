package inheritanceandpolymorphism.encapsulation;
/*
������������ʾ��ʹ�� private �ؼ����������ԣ������ζ�ų��� Employee �౾���⣬�����κ��඼�����Է�����Щ���ԡ�
���ǣ�����ͨ����Щ���Ե� setXxx() ������������и�ֵ��ͨ�� getXxx() ������������Щ���ԡ�
�� age ���Ե� setAge() �����У����ȶ��û����ݹ����Ĳ��� age �����жϣ���� age ��ֵ���� 18 �� 40 ֮�䣬
�� Employee ��� age ����ֵ����Ϊ 20������Ϊ���ݹ����Ĳ���ֵ��
��д������ EmployeeTest���ڸ���� main() �����е��� Employee ���Ե� setXxx() ����������Ӧ�����Խ��и�ֵ��
������ getXxx() �����������ԣ��������£�
 */
public class Employee {
    private String name; // ����
    private int age; // ����
    private String phone; // ��ϵ�绰
    private String address; // ��ͥסַ
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        // �������������
        if (age < 18 || age > 40) {
            System.out.println("���������18��40֮�䣡");
            this.age = 20; // Ĭ������
        } else {
            this.age = age;
        }
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}