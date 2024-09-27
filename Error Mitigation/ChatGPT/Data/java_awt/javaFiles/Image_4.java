import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;

public class Image_4 {
    public static void main(String[] args) {
        // Create an off-screen image
        BufferedImage offScreenImage = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB);
        
        // Get the graphics context for drawing to the off-screen image
        Graphics graphics = offScreenImage.getGraphics();
        
        // Draw on the off-screen image using the graphics context
        graphics.drawString("Hello, World!", 10, 10);
        
        // Dispose of the graphics context
        graphics.dispose();
    }
}
