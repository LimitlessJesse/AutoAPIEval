import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;

public class BufferedImage_5 {
    public static void main(String[] args) {
        // Create a new BufferedImage
        BufferedImage image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);

        // Get the WritableRaster from the BufferedImage
        WritableRaster raster = image.getRaster();

        // Print the raster
        System.out.println(raster);
    }
}
