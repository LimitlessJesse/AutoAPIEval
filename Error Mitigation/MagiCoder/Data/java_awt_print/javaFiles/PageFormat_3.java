import java.awt.print.PageFormat;
import java.awt.print.Paper;

public class PageFormat_3 {
    public static void main(String[] args) {
        PageFormat pageFormat = new PageFormat();
        Paper paper = new Paper();
        paper.setSize(8.5, 11); // A4 size
        pageFormat.setPaper(paper);
    }
}
