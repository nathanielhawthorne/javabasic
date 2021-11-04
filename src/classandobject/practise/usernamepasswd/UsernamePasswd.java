package classandobject.practise.usernamepasswd;
//用户输入用户名和密码，用户名输入正确后才能输入密码，密码输入错误后程序终结
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
        System.out.println("用户名："+userID+"密码："+passwd);
    }
}
