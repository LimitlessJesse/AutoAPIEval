import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;

public class FontMetrics_5 {
    public static void main(String[] args) {
        // Create a Graphics object
        Graphics g = GraphicsEnvironment.getLocalGraphicsEnvironment().createGraphics();

        // Create a Font
        Font font = new Font("Arial", Font.PLAIN, 16);

        // Get the FontMetrics
        FontMetrics fontMetrics = g.getFontMetrics(font);

        // Get the height of the font
        int height = fontMetrics.getHeight();

        // Print the height
        System.out.println("The height of the font is: " + height);
    }
}
