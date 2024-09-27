import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.VolatileImage;

public class VolatileImage_5 {
    public static void main(String[] args) {
        int width = 100;
        int height = 100;

        // Create a VolatileImage
        VolatileImage volatileImage = VolatileImage.createVolatileImage(width, height, BufferedImage.TYPE_INT_ARGB, null);

        // Get a Graphics2D object from the VolatileImage
        Graphics2D g2d = volatileImage.createGraphics();

        // Draw something on the VolatileImage
        g2d.drawString("Hello, World!!!", 50, 50);

        // Release the Graphics2D object
        g2d.dispose();

        // Get a snapshot of the VolatileImage
        BufferedImage snapshot = volatileImage.getSnapshot();

        // Print the snapshot
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int pixel = snapshot.getRGB(x, y);
                System.out.printf("(%d,%d): %s\n", x, y, Integer.toHexString(pixel));
            }
        }
    }
}
