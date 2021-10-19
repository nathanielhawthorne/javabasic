package wrapper.userregister;
//
public class Register {
    public static boolean validateUser(String uname,String upwd,String age) {
        boolean conUname = false;       // 用户名是否符合要求
        boolean conPwd = false;    // 密码是否符合要求
        boolean conAge = false;    // 年龄是否符合要求
        boolean con = false;    // 验证是否通过
        if (uname.length() > 0) {
            for (int i = 0;i < uname.length();i++) {
                // 验证用户名是否全部为字母，不能含有空格
                if (Character.isLetter(uname.charAt(i))) {
                    conUname = true;
                } else {
                    conUname = false;
                    System.out.println("用户名只能由字母组成，且不能含有空格！");
                    break;
                }
            }
        } else {
            System.out.println("用户名不能为空！");
        }
        if (upwd.length() > 0) {
            for (int j=0;j<upwd.length();j++) {
                // 验证密码是否由数字和字母组成，不能含有空格
                if (Character.isLetterOrDigit(upwd.charAt(j))) {
                    conPwd = true;
                } else {
                    conPwd = false;
                    System.out.println("密码只能由数字或字母组成！");
                    break;
                }
            }
        } else {
            System.out.println("密码不能为空！");
        }
        if (age.length() > 0) {
            for (int k = 0;k < age.length();k++) {
                // 验证年龄是否由数字组成
                if (Character.isDigit(age.charAt(k))) {
                    conAge = true;
                } else {
                    conAge = false;
                    System.out.println("年龄输入有误!");
                    break;
                }
            }
        } else {
            System.out.println("年龄必须输入！");
        }
        if (conUname && conPwd && conAge) {
            con = true;
        } else {
            con = false;
        }
        return con;
    }
}