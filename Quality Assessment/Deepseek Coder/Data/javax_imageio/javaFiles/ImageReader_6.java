import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageReader_6 {
    public static void main(String[] args) {
        try {
            File file = new File("path_to_your_image_file");
            ImageReader reader = ImageIO.createImageReaderIfNecessary(file);
            BufferedImage image = ImageIO.read(file);
            int width = reader.getWidth(0);
            System.out.println("Width of the image: " + width);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
