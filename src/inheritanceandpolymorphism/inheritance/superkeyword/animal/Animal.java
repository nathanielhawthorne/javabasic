package inheritanceandpolymorphism.inheritance.superkeyword.animal;

public class Animal {
    String color = "yellow";  //�����ʼ��һ���������ڴ洢��ɫ
    int footNo = 4;           //�����ʼ��һ���������ڴ洢����ŵ�����
    String bark = "barking";  //�����ʼ��һ���������ڴ洢����еĶ���

    //����һ���޷���ֵ��Ա����
    void animalPrintInfo(){
        System.out.println("��ʼ��������ɫΪ"+color+" "+"�ŵ�����Ϊ��"+footNo);
    }
    //���ඨ��һ���вι��췽��
    Animal(String color,int footNo){
        System.out.println("�����ʼ����ɫΪ��"+color+" "+"�����ʼ���ŵ�����Ϊ��"+footNo);
    }
}
