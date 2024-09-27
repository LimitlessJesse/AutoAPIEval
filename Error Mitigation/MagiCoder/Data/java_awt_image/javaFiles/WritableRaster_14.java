import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;

public class WritableRaster_14 {
    public static void main(String[] args) {
        BufferedImage image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        WritableRaster raster = image.getRaster();

        double[] pixel = {1.0, 0.5, 0.25}; // RGB values
        raster.setPixel(50, 50, pixel);
    }
}
