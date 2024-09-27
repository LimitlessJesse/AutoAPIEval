import java.awt.print.PageFormat;
import java.awt.print.Paper;

public class PageFormat_6 {
    public static void main(String[] args) {
        PageFormat pageFormat = new PageFormat();
        Paper paper = pageFormat.getPaper();
        System.out.println("Paper width: " + paper.getWidth());
        System.out.println("Paper height: " + paper.getHeight());
    }
}
