package classandobject.practise;

public class Test01 {
    public static int count = 1;                      //��̬��Ա�����ھ�̬�����б�����
    public int method1(){                             //����һ����Ա����
        count += 10;
        //System.out.println(count);
        test();                            //��Ա�������Ե��þ�̬��Ա��������̬��Ա�������ܵ��ó�Ա����

        return count;

    }

    public static int test(){                          //����һ����̬��Ա����
        count -= 1;
        //System.out.println(count);

        return count;
    }

    public static void main(String[]args){
        Test01 test01 = new Test01();
        System.out.println(test01.method1());             //��Ա��������ʵ�����࣬���ܱ�����
        //System.out.println(test());                    //��̬��Ա��������ֱ�ӱ�����
    }
}
