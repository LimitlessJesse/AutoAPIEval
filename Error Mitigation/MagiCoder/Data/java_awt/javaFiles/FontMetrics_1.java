import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class FontMetrics_1 {
    public static void main(String[] args) {
        // Create a Graphics object
        Graphics g = new Graphics2D();
        ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

        // Create a Font object
        Font font = new Font("Arial", Font.PLAIN, 12);

        // Create a FontMetrics object
        FontMetrics fontMetrics = g.getFontMetrics(font);

        // Get the ascent of the font
        int ascent = fontMetrics.getAscent();

        System.out.println("Ascent: " + ascent);
    }
}
