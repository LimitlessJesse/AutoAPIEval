import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;

public class ImageIO_1 {
    public static void main(String[] args) {
        try {
            BufferedImage image = ImageIO.read(new FileInputStream("path_to_your_image.jpg"));
            // do something with the image
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
