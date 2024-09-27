import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;

public class PageAttributes_3 {
    public static void main(String[] args) {
        PageFormat pageFormat = new PageFormat();
        Paper paper = new Paper();
        paper.setSize(8.5 * 72, 11 * 72);
        paper.setImageableArea(0, 0, paper.getWidth(), paper.getHeight());
        pageFormat.setPaper(paper);

        PageAttributes pageAttributes = new PageAttributes(pageFormat, Printable.FIT_TO_PAGE);
        PageAttributes cloneAttributes = (PageAttributes) pageAttributes.clone();

        System.out.println(cloneAttributes);
    }
}
