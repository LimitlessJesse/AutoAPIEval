import java.awt.Dimension;
import java.awt.ScrollPane;

public class ScrollPane_2 {
    public static void main(String[] args) {
        ScrollPane scrollPane = new ScrollPane();
        Dimension viewportSize = scrollPane.getViewportSize();
        System.out.println("Viewport size: " + viewportSize);
    }
}
