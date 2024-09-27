import javax.imageio.ImageIO;
import javax.imageio.ImageWriter;
import javax.imageio.spi.ImageWriterSpi;

public class ImageWriterSpi_4 {
    public static void main(String[] args) {
        ImageWriter writer = null;
        ImageWriterSpi spi = ImageIO.getImageWriterSpiByFormatName("gif");
        if (spi != null) {
            writer = spi.createWriterInstance();
            System.out.println("ImageWriter instance created successfully.");
        } else {
            System.out.println("ImageWriterSpi not found.");
        }
    }
}
