package StringSpilt;
//截取新闻标题
public class StringHeadSpilt {
    static String str[] = {"今天美国总统奥巴马会见了中国主席胡景涛","美国成功发射载人航天飞船",
            "澳大利亚森林发生火灾，情况十分严峻","马云会见俄罗斯总统普京",
            "MH370失联，案件正在进一步调查中"};
    public static void main(String[]args){
        for (int number = 0;number<5;number++){
            if (str[number].length()>5){
                System.out.println(str[number].substring(0,5)+"...");
            }else {
                System.out.println(str[number]);
            }
        }
    }
}
