import java.awt.print.PageFormat;
import java.awt.print.Paper;

public class PageFormat_4 {
    public static void main(String[] args) {
        PageFormat pageFormat = new PageFormat();
        Paper paper = new Paper();

        // Set the size of the paper
        paper.setSize(827, 1169);

        // Set the orientation of the paper
        paper.setOrientation(Paper.PORTRAIT);

        // Set the paper in the page format
        pageFormat.setPaper(paper);

        // Get the orientation of the page format
        int orientation = pageFormat.getOrientation();

        // Print the orientation
        System.out.println("Orientation: " + (orientation == PageFormat.ORIENTATION_PORTRAIT? "Portrait" : "Landscape"));
    }
}
