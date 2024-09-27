import java.awt.font.TextLayout;
import java.awt.geom.Rectangle2D;

public class TextLayout_4 {
    public static void main(String[] args) {
        // Create a TextLayout object
        TextLayout textLayout = new TextLayout("Hello", null, null);

        // Get the bounds of the TextLayout
        Rectangle2D bounds = textLayout.getBounds();

        // Print the bounds
        System.out.println("X: " + bounds.getX());
        System.out.println("Y: " + bounds.getY());
        System.out.println("Width: " + bounds.getWidth());
        System.out.println("Height: " + bounds.getHeight());
    }
}
