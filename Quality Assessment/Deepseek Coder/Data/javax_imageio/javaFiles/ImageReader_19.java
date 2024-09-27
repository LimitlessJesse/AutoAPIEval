import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import java.io.File;
import java.io.IOException;

public class ImageReader_19 {
    public static void main(String[] args) {
        try {
            File file = new File("path_to_your_image_file");
            ImageReader reader = ImageIO.createImageReaderIfNecessary(file);
            if (reader!= null) {
                boolean canReadRaster = reader.canReadRaster();
                System.out.println("Can read raster: " + canReadRaster);
            } else {
                System.out.println("No reader found for this file");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
