package objectpropertiesandbehaviour;
//�� Java �У�Ҫ���ö�������Ժ���Ϊ����Ҫʹ�õ㣨.�������������ʡ���������Բ����ߣ�
// ����Ա�������Ա������������Բ����ұߡ��﷨��ʽ���£�
//
//������.����(��Ա����)    // ���ʶ��������
//������.��Ա������()    // ���ʶ���ķ���
public class ObjectPropertiesAndBehaviour {
    String name;
    boolean sex;
    int age;
    public boolean isSex(){
        return sex;
    }


    public void printInfo(){
        System.out.println("�����ǣ�"+name+"�Ա�Ϊ��"+sex+"����Ϊ��"+age);
    }
}
