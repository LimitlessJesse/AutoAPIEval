import javax.imageio.ImageReader;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class ImageReader_4 {
    public static void main(String[] args) {
        try {
            File file = new File("image.jpg");
            ImageReader reader = ImageIO.getImageReadersByFormatName("jpg").next();

            reader.setInput(ImageIO.createImageInputStream(file));

            int numImages = reader.getNumImages(true);

            System.out.println("Number of images: " + numImages);

            reader.dispose();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
