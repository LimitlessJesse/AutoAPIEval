import java.awt.font.TextLayout;
import java.awt.geom.Rectangle2D;

public class TextLayout_1 {
    public static void main(String[] args) {
        TextLayout textLayout = new TextLayout("Hello, World!", null, null);
        Rectangle2D bounds = textLayout.getBounds();
        System.out.println("Bounds: " + bounds);
    }
}
