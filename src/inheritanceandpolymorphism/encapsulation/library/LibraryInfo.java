package inheritanceandpolymorphism.encapsulation.library;
/*

    基本信息包括图书名称（bookName）、总页数（pagelbtalNum），其中页数不能少于 200 页，否则输出错误信息，
    并赋予默认值 200。为各个属性设置赋值和取值方法。具有 details() 方法，该方法在控制台输出每本图书的名称和总页数。

编写 BookTest 测试类，为 Book 对象的属性赋予初始值，并调用 details() 方法输出详细信息。根据上面的描述添加代码，
步骤如下。

 */
public class LibraryInfo {
    private String bookName;
    private int pageTotalNum = 200;

    public void setBookName(String bookName){
        this.bookName = bookName;
    }
    public String getBookName(){
        return bookName;
    }
    public void setPageTotalNum(int pageTotalNum){
        if (pageTotalNum<200){
            System.out.println(bookName+"不能少于两百页");
            this.pageTotalNum = 200;
        }else {
            this.pageTotalNum = pageTotalNum;
        }

    }
    public int getPageTotalNum(){
        return pageTotalNum;
    }
    public void details(){
        System.out.println("图书名称："+bookName+" "+"总页数："+pageTotalNum);
    }
}
