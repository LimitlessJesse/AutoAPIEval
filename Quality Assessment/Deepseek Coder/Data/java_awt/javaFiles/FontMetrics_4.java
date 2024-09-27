import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class FontMetrics_4 {
    public static void main(String[] args) {
        String text = "Hello, World!";
        Font font = new Font("Arial", Font.PLAIN, 16);

        // Create a graphics object
        Graphics graphics = null; // You need to provide an actual Graphics object here
        ((Graphics2D) graphics).setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

        // Get FontMetrics
        FontMetrics fontMetrics = graphics.getFontMetrics(font);

        // Get the width of the text
        int width = fontMetrics.stringWidth(text);

        System.out.println("The width of the text is: " + width);
    }
}
