import java.awt.print.Book;
import java.awt.print.PageFormat;
import java.awt.print.Paper;

public class Book_1 {
    public static void main(String[] args) {
        // Create a new Book
        Book book = new Book();

        // Create a new PageFormat
        PageFormat pageFormat = new PageFormat();

        // Create a new Paper
        Paper paper = new Paper();

        // Set the size of the paper
        paper.setSize(210, 297); // A4 size

        // Set the paper in the PageFormat
        pageFormat.setPaper(paper);

        // Add the PageFormat to the Book
        book.append(pageFormat, null);

        // Get the number of pages in the Book
        int numberOfPages = book.getNumberOfPages();

        // Print the number of pages
        System.out.println("Number of pages: " + numberOfPages);
    }
}
