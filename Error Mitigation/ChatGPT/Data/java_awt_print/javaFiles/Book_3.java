import java.awt.print.Book;
import java.awt.print.PageFormat;

public class Book_3 {
    public static void main(String[] args) {
        Book book = new Book();
        // Assuming pageIndex is 0
        try {
            PageFormat pageFormat = book.getPageFormat(0);
            System.out.println("Page Format: " + pageFormat.toString());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
