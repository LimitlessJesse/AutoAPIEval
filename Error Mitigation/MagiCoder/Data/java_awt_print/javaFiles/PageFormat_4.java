import java.awt.print.PageFormat;
import java.awt.print.Paper;

public class PageFormat_4 {
    public static void main(String[] args) {
        PageFormat pageFormat = new PageFormat();
        Paper paper = new Paper();
        paper.setSize(8.5, 11);
        pageFormat.setPaper(paper);

        Paper copiedPaper = pageFormat.getPaper();
        System.out.println("Original paper size: " + paper.getSize());
        System.out.println("Copied paper size: " + copiedPaper.getSize());
    }
}
