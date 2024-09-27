import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;

public class WritableRaster_5 {
    public static void main(String[] args) {
        BufferedImage image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        WritableRaster raster = image.getRaster();

        // Set a sample in the specified band for the pixel located at (x,y)
        raster.setSample(50, 50, 0, 255); // Sets red component of pixel at (50,50)
        raster.setSample(50, 50, 1, 0);   // Sets green component of pixel at (50,50)
        raster.setSample(50, 50, 2, 0);   // Sets blue component of pixel at (50,50)
    }
}
