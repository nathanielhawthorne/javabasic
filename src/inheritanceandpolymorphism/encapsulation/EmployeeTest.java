package inheritanceandpolymorphism.encapsulation;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee people = new Employee();
        people.setName("������");
        people.setAge(35);
        people.setPhone("13653835964");
        people.setAddress("�ӱ�ʡʯ��ׯ��");
        System.out.println("������" + people.getName());
        System.out.println("���䣺" + people.getAge());
        System.out.println("�绰��" + people.getPhone());
        System.out.println("��ͥסַ��" + people.getAddress());
    }
}