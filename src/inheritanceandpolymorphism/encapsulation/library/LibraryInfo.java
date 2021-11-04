package inheritanceandpolymorphism.encapsulation.library;
/*

    ������Ϣ����ͼ�����ƣ�bookName������ҳ����pagelbtalNum��������ҳ���������� 200 ҳ���������������Ϣ��
    ������Ĭ��ֵ 200��Ϊ�����������ø�ֵ��ȡֵ���������� details() �������÷����ڿ���̨���ÿ��ͼ������ƺ���ҳ����

��д BookTest �����࣬Ϊ Book ��������Ը����ʼֵ�������� details() ���������ϸ��Ϣ�����������������Ӵ��룬
�������¡�

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
            System.out.println(bookName+"������������ҳ");
            this.pageTotalNum = 200;
        }else {
            this.pageTotalNum = pageTotalNum;
        }

    }
    public int getPageTotalNum(){
        return pageTotalNum;
    }
    public void details(){
        System.out.println("ͼ�����ƣ�"+bookName+" "+"��ҳ����"+pageTotalNum);
    }
}
