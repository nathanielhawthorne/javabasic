package wrapper.userregister;
//
public class Register {
    public static boolean validateUser(String uname,String upwd,String age) {
        boolean conUname = false;       // �û����Ƿ����Ҫ��
        boolean conPwd = false;    // �����Ƿ����Ҫ��
        boolean conAge = false;    // �����Ƿ����Ҫ��
        boolean con = false;    // ��֤�Ƿ�ͨ��
        if (uname.length() > 0) {
            for (int i = 0;i < uname.length();i++) {
                // ��֤�û����Ƿ�ȫ��Ϊ��ĸ�����ܺ��пո�
                if (Character.isLetter(uname.charAt(i))) {
                    conUname = true;
                } else {
                    conUname = false;
                    System.out.println("�û���ֻ������ĸ��ɣ��Ҳ��ܺ��пո�");
                    break;
                }
            }
        } else {
            System.out.println("�û�������Ϊ�գ�");
        }
        if (upwd.length() > 0) {
            for (int j=0;j<upwd.length();j++) {
                // ��֤�����Ƿ������ֺ���ĸ��ɣ����ܺ��пո�
                if (Character.isLetterOrDigit(upwd.charAt(j))) {
                    conPwd = true;
                } else {
                    conPwd = false;
                    System.out.println("����ֻ�������ֻ���ĸ��ɣ�");
                    break;
                }
            }
        } else {
            System.out.println("���벻��Ϊ�գ�");
        }
        if (age.length() > 0) {
            for (int k = 0;k < age.length();k++) {
                // ��֤�����Ƿ����������
                if (Character.isDigit(age.charAt(k))) {
                    conAge = true;
                } else {
                    conAge = false;
                    System.out.println("������������!");
                    break;
                }
            }
        } else {
            System.out.println("����������룡");
        }
        if (conUname && conPwd && conAge) {
            con = true;
        } else {
            con = false;
        }
        return con;
    }
}