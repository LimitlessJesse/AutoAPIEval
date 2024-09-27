import java.awt.print.PageFormat;

public class PageFormat_1 {
    public static void main(String[] args) {
        PageFormat pageFormat = new PageFormat();
        int orientation = PageFormat.PORTRAIT; // or PageFormat.LANDSCAPE
        pageFormat.setOrientation(orientation);
        System.out.println("Page orientation set to: " + orientation);
    }
}
