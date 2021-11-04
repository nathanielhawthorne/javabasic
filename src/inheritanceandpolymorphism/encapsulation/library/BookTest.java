package inheritanceandpolymorphism.encapsulation.library;

public class BookTest {
    public static void main(String[]args){
        LibraryInfo bookTest = new LibraryInfo();
        bookTest.setBookName("½ðÆ¿Ã·");
        bookTest.setPageTotalNum(100);
        bookTest.getBookName();
        bookTest.getPageTotalNum();
        bookTest.details();
    }
}
