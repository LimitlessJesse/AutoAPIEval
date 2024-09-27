import java.awt.Graphics2D;
import java.awt.image.VolatileImage;

public class VolatileImage_2 {
    public static void main(String[] args) {
        VolatileImage volatileImage = new VolatileImage(100, 100);
        
        // Get a Graphics2D object from VolatileImage
        Graphics2D g = volatileImage.createGraphics();
        
        // Use Graphics2D object to draw on VolatileImage
        g.drawString("Hello, Graphics2D!", 10, 30);
        
        // Dispose the Graphics2D object
        g.dispose();
    }
}
