package classandobject.practise.checknumber;
//01.��ĳ�Ա���� ��������Ϸһ����A��һ����Ա����v��һ����ֵ100��
// ����һ�����A��ĳ�Ա����v���в¡������������ʾ����С������ʾС�ˡ���������ʾ�²�ɹ���
public class Method {
    int v = 100;

    public String result(int input){
        if (input>v){
            return "����";
        }else {
            return "С��";
        }
    }
}
