import java.awt.FontRenderContext;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.font.TextLayout;

public class TextLayout_4 {
    public static void main(String[] args) {
        Font font = new Font("Arial", Font.PLAIN, 12);
        FontRenderContext frc = new FontRenderContext(null, true, true);
        TextLayout layout = new TextLayout("Hello World", font, frc);
        
        float x = 50.0f;
        float y = 50.0f;
        
        Rectangle pixelBounds = layout.getPixelBounds(frc, x, y);
        
        System.out.println("Pixel Bounds: " + pixelBounds);
    }
}
