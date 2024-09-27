import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;

public class WritableRaster_6 {
    public static void main(String[] args) {
        BufferedImage image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        WritableRaster raster = image.getRaster();

        int[] pixel = {255, 0, 0}; // red pixel
        raster.setPixel(50, 50, pixel);
    }
}
