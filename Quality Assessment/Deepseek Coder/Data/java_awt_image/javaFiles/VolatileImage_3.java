import java.awt.Graphics2D;
import java.awt.image.VolatileImage;

public class VolatileImage_3 {
    public static void main(String[] args) {
        // Create a VolatileImage
        VolatileImage volatileImage = VolatileImage.createVolatileImage(100, 100, VolatileImage.TYPE_INT_ARGB);

        // Get the Graphics2D from the VolatileImage
        Graphics2D graphics2D = volatileImage.createGraphics();

        // Use the graphics2D object to draw on the VolatileImage
        // For example, let's draw a rectangle
        graphics2D.drawRect(10, 10, 80, 80);

        // Don't forget to dispose the graphics2D object when you're done with it
        graphics2D.dispose();
    }
}
