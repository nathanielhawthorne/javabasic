package array.application;

import javax.naming.NamingEnumeration;

//Java��Ʒ��Ϣ��ѯ
/*
�����ڲֿ�ϵͳ�У�ÿ����Ʒ���� 3 �������Ϣ���ֱ�����������������͵�ǰ�������
����һ��һά�������洢 5 ����Ʒ�����ƣ�������һ����ά�������洢�� 5 ����Ʒ�� 3 �������Ϣ��
�û����Ը�����Ʒ���Ʋ�ѯ����Ʒ�����п�棬Ҳ���Բ鿴ĳ�������������С�� 100 ����Ʒ������
�������������п�������ӵ͵��ߵ�˳�����С�
 */
public class JavaProductInformationQuery {
    public static void main(String[]args){
        String[] product = {"����","����","����","����","����"};
        int[][][] Inventory = new int[500][500][500];//������������������Ϳ���������ֵ
        for (int i = 0;i<Inventory.length;i++){
            for (int j = 0;j<Inventory.length;j++){
                for (int k = 0;k<Inventory.length;k++){
                    System.out.print(Inventory[i][j][k]);
                }
            }
        }

    }
}
