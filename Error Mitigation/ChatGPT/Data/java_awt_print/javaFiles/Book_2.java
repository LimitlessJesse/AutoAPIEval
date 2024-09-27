import java.awt.print.Book;

public class Book_2 {
    public static void main(String[] args) {
        Book book = new Book();
        int numberOfPages = book.getNumberOfPages();
        System.out.println("Number of pages: " + numberOfPages);
    }
}
