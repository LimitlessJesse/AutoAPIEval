import java.awt.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;

public class Graphics2D_3 {
    public static void main(String[] args) {
        // Create a BufferedImage to draw on
        BufferedImage image = new BufferedImage(200, 200, BufferedImage.TYPE_INT_ARGB);
        
        // Get the Graphics2D object from the BufferedImage
        Graphics2D g2d = image.createGraphics();
        
        // Set the Paint attribute to Color.RED
        g2d.setPaint(Color.RED);
        
        // Draw a rectangle with the set color
        g2d.fillRect(50, 50, 100, 100);
        
        // Dispose of the Graphics2D object
        g2d.dispose();
        
        // Display the image
        // (Code for displaying the image is not included in this snippet)
    }
}
