package JavaString;

public class StringAnd2 {
    static String str = "��������\t";
    public static void main(String[]args){
        str = str.concat("��¥��"+"\t");
        str = str.concat("ˮ䰴�"+"\t");
        str = str.concat("���μ�"+"\t");
        System.out.println(str);
        String str2 = "����\t";
        System.out.println(str2.concat("�ձ�"+"\t").concat("�¹�\t").concat("����\t"));
    }
}
