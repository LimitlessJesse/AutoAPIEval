import java.awt.font.TextLayout;
import java.awt.geom.Rectangle2D;

public class TextLayout_1 {
    public static void main(String[] args) {
        // Create a TextLayout object
        TextLayout textLayout = new TextLayout("Hello World!", null, null);
        
        // Get the bounds of the text layout
        Rectangle2D bounds = textLayout.getBounds();
        
        // Print the bounds
        System.out.println("Bounds: " + bounds);
    }
}
