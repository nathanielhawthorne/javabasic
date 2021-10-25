package classandobject.practise.personalinfo;
/*
09.构造方法与重载 ,定义一个网络用户类 要处理的信息有用户ID、用户密码、email地址。在建立类的实例时
把以上三个信息都作为构造函数的参数输入,其中用户ID和用户密码时必须的,缺省的email地址是用户ID加上字符串”
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
        return "用户名："+userID+" "+"密码："+" "+passwd+" "+"邮箱地址："+emailAddress;
    }
}
