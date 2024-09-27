import java.awt.FontMetrics;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;

public class FontMetrics_4 {
    public static void main(String[] args) {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Font[] fonts = ge.getAllFonts();
        
        // Choose a font
        Font font = fonts[0].deriveFont(12.0f);
        
        // Create a FontMetrics object
        Graphics g = new Graphics();
        FontMetrics fm = g.getFontMetrics(font);
        
        // Get the font ascent
        int ascent = fm.getAscent();
        System.out.println("Font Ascent: " + ascent);
    }
}
