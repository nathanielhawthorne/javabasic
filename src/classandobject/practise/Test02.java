package classandobject.practise;

public class Test02 {
    public static int count = 1;
    /*
    public static int method(){
        count+=1;
        System.out.println(count);
        return count;
    }

     */
    //����һ���Ǿ�̬����飬�Ǿ�̬��������ڴ�������ʱ�Զ�ִ�еĴ��룬����������ִ�и���ķǾ�̬����飬
    // �������ж���ı������Ǿֲ��ģ�ֻ�����еĴ�����Ե��á�

    {
        count+=1;
        System.out.println(count);
    }
    //����������̬�����
    /*
    ������а��������̬����飬�� Java ������������������г��ֵ�˳������ִ�����ǣ�ÿ����̬�����ֻ�ᱻִ��һ�Ρ�
     */

    /**
     *
     * @author:
     * @description:
     */
    static {
        count-=10;
        System.out.println(count);
    }
    static {
        count+=5;
        System.out.println(count);
    }
    public static void main(String[]args){
        System.out.println();
        System.out.println("ʵ����һ���࣬�����");
        Test02 test02 = new Test02();
        System.out.println("ʵ����һ���࣬�����");
        Test02 test021 = new Test02();

    }
}
