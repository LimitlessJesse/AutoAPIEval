import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;
import javax.imageio.spi.ImageInputStreamSpi;
import java.io.File;
import java.io.IOException;

public class ImageInputStreamSpi_2 {
    public static void main(String[] args) {
        ImageInputStream imageInputStream = null;
        try {
            ImageIO.scanForPlugins();
            ImageInputStreamSpi spi = ImageIO.getImageReaderSpiByFormatName("JPEG").createInputStreamInstance(null, new File("example.jpg"));
            imageInputStream = spi.createInputStreamInstance(null, new File("example.jpg"));
            // Use the ImageInputStream object
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (imageInputStream != null) {
                try {
                    imageInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
