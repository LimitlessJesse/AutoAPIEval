import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageReader_8 {
    public static void main(String[] args) {
        try {
            File file = new File("path_to_your_image_file");
            ImageReader reader = ImageIO.createImageReader(file);
            reader.setInput(ImageIO.createImageInputStream(file));
            BufferedImage image = reader.read(0);
            // Now you can use the image object
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
