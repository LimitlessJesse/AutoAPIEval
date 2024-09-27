import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;

public class FontMetrics_2 {
    public static void main(String[] args) {
        // Get the GraphicsEnvironment instance
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();

        // Get all available fonts
        Font[] availableFonts = ge.getAllFonts();

        // Choose a font
        Font font = new Font("Arial", Font.PLAIN, 12);

        // Get the FontMetrics for the chosen font
        FontMetrics fontMetrics = ge.getFontMetrics(font);

        // Get the descent of the font
        int descent = fontMetrics.getDescent();

        System.out.println("The descent of the font is: " + descent);
    }
}
