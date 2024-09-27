import java.awt.image.BufferedImage;
import java.awt.image.Raster;

public class Raster_3 {
    public static void main(String[] args) {
        BufferedImage image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        Raster raster = image.getRaster();
        int height = raster.getHeight();
        System.out.println("Height of the image: " + height);
    }
}
