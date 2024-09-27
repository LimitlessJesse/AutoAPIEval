import java.awt.image.VolatileImage;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class VolatileImage_2 {
    public static void main(String[] args) {
        BufferedImage bufferedImage = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = bufferedImage.createGraphics();
        VolatileImage volatileImage = g2d.createVolatileImage(100, 100);
        int height = volatileImage.getHeight();
        System.out.println("Height of VolatileImage: " + height);
    }
}
