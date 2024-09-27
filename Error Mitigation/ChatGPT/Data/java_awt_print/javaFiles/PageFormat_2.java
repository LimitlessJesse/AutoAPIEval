import java.awt.print.PageFormat;

public class PageFormat_2 {
    public static void main(String[] args) {
        PageFormat pageFormat = new PageFormat();
        double height = pageFormat.getHeight();
        System.out.println("Height of the page: " + height);
    }
}
