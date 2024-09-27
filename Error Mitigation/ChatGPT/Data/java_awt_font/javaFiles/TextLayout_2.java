import java.awt.font.TextLayout;
import java.awt.geom.AffineTransform;
import java.awt.Shape;

public class TextLayout_2 {
    public static void main(String[] args) {
        TextLayout textLayout = new TextLayout("Hello World", null, null);
        Shape outline = textLayout.getOutline(null);
        System.out.println(outline);
    }
}
