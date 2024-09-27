import java.awt.print.PageFormat;

public class PageFormat_1 {
    public static void main(String[] args) {
        PageFormat pageFormat = new PageFormat();
        double width = pageFormat.getWidth();
        System.out.println("Width of the page: " + width);
    }
}
