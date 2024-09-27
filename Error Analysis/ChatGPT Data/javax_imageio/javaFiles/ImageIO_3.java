import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import java.io.IOException;
import java.util.Iterator;

public class ImageIO_3 {
    public static void main(String[] args) {
        try {
            String formatName = "JPEG"; // specify the format name
            Iterator<ImageReader> readers = ImageIO.getImageReadersByFormatName(formatName);
            
            while (readers.hasNext()) {
                ImageReader reader = readers.next();
                System.out.println("ImageReader: " + reader);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
