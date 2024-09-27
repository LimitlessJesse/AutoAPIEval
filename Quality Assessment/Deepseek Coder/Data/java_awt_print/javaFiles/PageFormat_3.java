import java.awt.print.PageFormat;
import java.awt.print.Paper;

public class PageFormat_3 {
    public static void main(String[] args) {
        PageFormat pageFormat = new PageFormat();
        Paper paper = pageFormat.getPaper();
        paper.setImageableArea(0, 0, paper.getWidth(), paper.getHeight());
        pageFormat.setPaper(paper);

        // Set orientation to landscape
        pageFormat.setOrientation(PageFormat.LANDSCAPE);
    }
}
