import java.awt.print.PageFormat;

public class PageFormat_4 {
    public static void main(String[] args) {
        PageFormat pageFormat = new PageFormat();
        try {
            pageFormat.setOrientation(PageFormat.LANDSCAPE);
            System.out.println("Page orientation set to: " + pageFormat.getOrientation());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid orientation provided.");
        }
    }
}
