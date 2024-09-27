import java.awt.print.PageFormat;
import java.awt.print.Paper;

public class PageFormat_3 {
    public static void main(String[] args) {
        PageFormat pageFormat = new PageFormat();
        Paper paper = new Paper();
        paper.setSize(595.22, 841.85); // A4 size in points
        paper.setImageableArea(0, 0, paper.getWidth(), paper.getHeight()); // Imageable area
        pageFormat.setPaper(paper);
        
        System.out.println("Page Width: " + paper.getWidth());
        System.out.println("Page Height: " + paper.getHeight());
    }
}
