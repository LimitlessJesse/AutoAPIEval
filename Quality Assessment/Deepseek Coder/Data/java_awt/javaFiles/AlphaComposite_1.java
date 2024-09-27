import java.awt.AlphaComposite;
import java.awt.Composite;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class AlphaComposite_1 {
    public static void main(String[] args) {
        // Create a new BufferedImage
        BufferedImage image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB);

        // Get the Graphics2D object from the image
        Graphics2D g2d = image.createGraphics();

        // Set the composite to a new AlphaComposite with SRC_OVER rule and 0.5f alpha
        Composite composite = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.5f);
        g2d.setComposite(composite);

        // Fill the image with a color
        g2d.setColor(java.awt.Color.RED);
        g2d.fillRect(0, 0, image.getWidth(), image.getHeight());

        // Dispose of the Graphics2D object
        g2d.dispose();
    }
}
