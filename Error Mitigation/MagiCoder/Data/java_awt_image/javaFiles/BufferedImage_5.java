import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class BufferedImage_5 {
    public static void main(String[] args) {
        BufferedImage image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB);
        Graphics graphics = image.getGraphics();
        // Now you can use the graphics object to draw on the image.
    }
}
