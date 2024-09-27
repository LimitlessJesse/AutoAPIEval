import java.awt.FontMetrics;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;

public class FontMetrics_5 {
    public static void main(String[] args) {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Font[] fonts = ge.getAllFonts();
        
        // Choose a font to get FontMetrics
        Font font = fonts[0];
        FontMetrics fontMetrics = new FontMetrics(font) {
        };
        
        int descent = fontMetrics.getDescent();
        System.out.println("Font Descent: " + descent);
    }
}
