import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import java.awt.Transparency;
import java.awt.image.BufferedImage;

public class GraphicsConfiguration_7 {
    public static void main(String[] args) {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsConfiguration gc = ge.getDefaultScreenDevice().getDefaultConfiguration();

        int width = 100;
        int height = 100;
        int transparency = Transparency.OPAQUE;

        BufferedImage image = gc.createCompatibleImage(width, height, transparency);

        // You can now use the image...
    }
}
