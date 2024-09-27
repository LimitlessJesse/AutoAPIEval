import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;

public class WritableRaster_12 {
    public static void main(String[] args) {
        BufferedImage image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        WritableRaster raster = image.getRaster();

        // Set a sample in the specified band for the pixel located at (x,y)
        raster.setSample(50, 50, 0, 255.0); // Set red component
        raster.setSample(50, 50, 1, 0.0);   // Set green component
        raster.setSample(50, 50, 2, 0.0);   // Set blue component
    }
}
