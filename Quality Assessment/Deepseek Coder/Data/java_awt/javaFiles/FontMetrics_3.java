import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class FontMetrics_3 {
    public static void main(String[] args) {
        // Create a font
        Font font = new Font("Arial", Font.PLAIN, 16);
        
        // Create a graphics object
        Graphics graphics = new Graphics2D();
        
        // Get the font metrics
        FontMetrics fontMetrics = graphics.getFontMetrics(font);
        
        // Get the leading
        int leading = fontMetrics.getLeading();
        
        // Print the leading
        System.out.println("Leading: " + leading);
    }
}
