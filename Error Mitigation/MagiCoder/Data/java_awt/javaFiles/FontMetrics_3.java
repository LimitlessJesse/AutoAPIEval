import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;

public class FontMetrics_3 {
    public static void main(String[] args) {
        // Get the GraphicsEnvironment instance
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();

        // Get all available fonts
        Font[] availableFonts = ge.getAllFonts();

        // Choose a font
        Font font = new Font("Arial", Font.PLAIN, 12);

        // Create a Graphics object
        Graphics g = getGraphics();

        // Get the FontMetrics for the chosen font
        FontMetrics fontMetrics = g.getFontMetrics(font);

        // Get the height of the font
        int height = fontMetrics.getHeight();

        System.out.println("The height of the font is: " + height);
    }
}
