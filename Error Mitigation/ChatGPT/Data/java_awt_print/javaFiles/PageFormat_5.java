import java.awt.print.PageFormat;
import java.awt.print.Paper;

public class PageFormat_5 {
    public static void main(String[] args) {
        PageFormat pageFormat = new PageFormat();
        Paper paper = pageFormat.getPaper();
        System.out.println("Width: " + paper.getWidth());
        System.out.println("Height: " + paper.getHeight());
    }
}
