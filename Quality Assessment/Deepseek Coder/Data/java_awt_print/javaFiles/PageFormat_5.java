import java.awt.print.PageFormat;
import java.awt.print.Paper;

public class PageFormat_5 {
    public static void main(String[] args) {
        // Create a new PageFormat object
        PageFormat pageFormat = new PageFormat();

        // Create a new Paper object
        Paper paper = new Paper();

        // Set the size of the paper
        paper.setSize(210, 297); // A4 size in millimeters

        // Set the paper in the PageFormat
        pageFormat.setPaper(paper);

        // Print the PageFormat
        System.out.println(pageFormat);
    }
}
