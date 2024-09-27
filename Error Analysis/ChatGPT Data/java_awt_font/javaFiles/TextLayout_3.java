import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.font.TextLayout;

public class TextLayout_3 {
    public static void main(String[] args) {
        String text = "Hello, World!";
        Font font = new Font("Arial", Font.PLAIN, 12);
        TextLayout textLayout = new TextLayout(text, font, new FontRenderContext(null, true, false));
        
        Shape outline = textLayout.getOutline(new AffineTransform());
        System.out.println(outline.getBounds());
    }
}
