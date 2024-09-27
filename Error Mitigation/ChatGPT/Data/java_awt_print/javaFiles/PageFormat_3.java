import java.awt.print.PageFormat;

public class PageFormat_3 {
    public static void main(String[] args) {
        PageFormat pageFormat = new PageFormat();
        int orientation = pageFormat.getOrientation();
        System.out.println("Page orientation: " + orientation);
    }
}
