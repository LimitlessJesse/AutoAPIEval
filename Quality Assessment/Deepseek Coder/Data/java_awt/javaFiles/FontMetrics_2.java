import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class FontMetrics_2 {
    public static void main(String[] args) {
        // Create a font
        Font font = new Font("Arial", Font.PLAIN, 16);
        
        // Create a graphics object
        Graphics graphics = new Graphics2D();
        
        // Get the font metrics
        FontMetrics fontMetrics = graphics.getFontMetrics(font);
        
        // Get the descent
        int descent = fontMetrics.getDescent();
        
        // Print the descent
        System.out.println("Descent: " + descent);
    }
}
