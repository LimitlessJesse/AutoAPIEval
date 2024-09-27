import java.awt.image.BufferedImage;
import java.awt.image.Raster;

public class Raster_2 {
    public static void main(String[] args) {
        BufferedImage image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        Raster raster = image.getRaster();
        int width = raster.getWidth();
        System.out.println("Width of the image: " + width);
    }
}
