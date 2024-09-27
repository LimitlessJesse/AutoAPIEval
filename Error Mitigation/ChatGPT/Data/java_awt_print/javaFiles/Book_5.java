import java.awt.print.Book;
import java.awt.print.PageFormat;
import java.awt.print.Printable;

public class Book_5 {
    public static void main(String[] args) {
        Book book = new Book();
        Printable painter = null; // Initialize with your Printable implementation
        PageFormat pageFormat = new PageFormat(); // Initialize with your desired PageFormat
        
        try {
            book.setPage(0, painter, pageFormat);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }
    }
}
