package classandobject.practise.personalinfo;
/*
09.���췽�������� ,����һ�������û��� Ҫ�������Ϣ���û�ID���û����롢email��ַ���ڽ������ʵ��ʱ
������������Ϣ����Ϊ���캯���Ĳ�������,�����û�ID���û�����ʱ�����,ȱʡ��email��ַ���û�ID�����ַ�����
 */
public class Method {
    String userID;
    String passwd;
    String emailAddress;

    public Method(String userID,String passwd,String emailAddress){
        this.userID = userID;
        this.passwd = passwd;
        this.emailAddress = emailAddress;

    }
    public Method(String userID,String passwd){
        this.userID = userID;
        this.passwd = passwd;
        this.emailAddress = userID+"@qq.com";
    }

    public String printInfo(){
        return "�û�����"+userID+" "+"���룺"+" "+passwd+" "+"�����ַ��"+emailAddress;
    }
}
