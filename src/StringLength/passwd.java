package StringLength;

import java.util.Scanner;

/*
在学生信息管理系统中对管理员密码有这样的规定，即密码长度必须大于 6 位且小于 12 位。
因为密码太短容易被破解，太长的话又不容易记住。
这就需要首先获取用户输入的密码字符串，然后调用 length() 方法获取长度，再做进一步的长度判断，最终实现代码如下所示：
 */
public class passwd {
    static String passwd;
    public static void main(String[]args){
        do {
            System.out.println("请输入你的密码：");
            Scanner input = new Scanner(System.in);
            passwd = input.next();
        }while(passwd.length()<=6||passwd.length()>=12);
        System.out.println("密码录入成功！");
    }
}
