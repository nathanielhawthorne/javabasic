package classandobject.practise.usernamepasswd;
//�û������û��������룬�û���������ȷ������������룬����������������ս�
public class UsernamePasswd {
    String userID;
    String passwd;

    public UsernamePasswd(String userID,String passwd){
        this.passwd = passwd;
        this.userID = userID;
    }
    public String setUserID(String userID){
        this.userID = userID;
        return userID;
    }
    public String getUserID(){
        return userID;
    }
    public String setPasswd(String passwd){
        this.passwd = passwd;
        return passwd;
    }
    public String getPasswd(){
        return passwd;
    }
    public void printInfo(){
        System.out.println("�û�����"+userID+"���룺"+passwd);
    }
}
