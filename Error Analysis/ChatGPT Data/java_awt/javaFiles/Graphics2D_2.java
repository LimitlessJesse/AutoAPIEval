import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Color;
import java.awt.image.BufferedImage;

public class Graphics2D_2 {
    public static void main(String[] args) {
        BufferedImage image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = image.createGraphics();
        
        // Setting rendering hint for anti-aliasing
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        // Drawing a rectangle with anti-aliasing enabled
        g2d.setColor(Color.RED);
        g2d.fillRect(10, 10, 50, 50);
        
        g2d.dispose();
    }
}
