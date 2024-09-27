import java.awt.print.PageFormat;
import java.awt.print.Paper;

public class PageFormat_2 {
    public static void main(String[] args) {
        PageFormat pageFormat = new PageFormat();
        Paper paper = new Paper();
        paper.setSize(8.5 * 72, 11 * 72);
        pageFormat.setPaper(paper);
        int orientation = pageFormat.getOrientation();
        System.out.println("Orientation: " + orientation);
    }
}
