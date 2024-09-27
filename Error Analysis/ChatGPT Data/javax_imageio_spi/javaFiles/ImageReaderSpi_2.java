import javax.imageio.ImageIO;
import javax.imageio.spi.ImageReaderSpi;
import javax.imageio.ImageReader;
import java.io.IOException;

public class ImageReaderSpi_2 {
    public static void main(String[] args) {
        String formatName = "JPEG";
        ImageReaderSpi provider = ImageIO.getReaderSpiByFormatName(formatName);
        
        try {
            ImageReader reader = provider.createReaderInstance();
            System.out.println("ImageReader instance created: " + reader);
        } catch (IOException e) {
            System.out.println("Error creating ImageReader instance: " + e.getMessage());
        }
    }
}
