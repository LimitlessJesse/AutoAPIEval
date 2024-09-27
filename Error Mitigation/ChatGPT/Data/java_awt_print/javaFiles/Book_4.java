import java.awt.print.Book;
import java.awt.print.Pageable;
import java.awt.print.Printable;

public class Book_4 {
    public static void main(String[] args) {
        Book book = new Book();
        Printable printable = book.getPrintable(0);
        // Use the Printable instance to render the page
    }
}
