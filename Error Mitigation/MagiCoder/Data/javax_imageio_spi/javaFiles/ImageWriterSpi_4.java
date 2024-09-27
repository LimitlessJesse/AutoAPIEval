import javax.imageio.ImageIO;
import javax.imageio.spi.ImageWriterSpi;
import javax.imageio.ImageWriter;
import java.io.IOException;

public class ImageWriterSpi_4 {
    public static void main(String[] args) {
        try {
            ImageWriterSpi writerSpi = ImageIO.getImageWritersBySuffix("jpg").next();
            ImageWriter writer = writerSpi.createWriterInstance(null);
            // Use the writer instance as needed...
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
