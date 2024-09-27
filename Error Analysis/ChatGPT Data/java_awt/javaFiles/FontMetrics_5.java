import java.awt.FontMetrics;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class FontMetrics_5 {
    public static void main(String[] args) {
        // Create a font object
        Font font = new Font("Arial", Font.PLAIN, 12);
        
        // Create a temporary image to obtain FontMetrics
        BufferedImage img = new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = img.createGraphics();
        g2d.setFont(font);
        FontMetrics fm = g2d.getFontMetrics();
        
        // Get the height of the font
        int height = fm.getHeight();
        
        System.out.println("Height of the font: " + height);
    }
}
