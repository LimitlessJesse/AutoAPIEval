import java.awt.FontMetrics;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;

public class FontMetrics_3 {
    public static void main(String[] args) {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Font[] fonts = ge.getAllFonts();
        
        // Choose a font to get FontMetrics
        Font font = fonts[0];
        FontMetrics fontMetrics = new FontMetrics(font) {
            @Override
            public int getHeight() {
                return super.getHeight();
            }
        };
        
        int height = fontMetrics.getHeight();
        System.out.println("Height of the font: " + height);
    }
}
