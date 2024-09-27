import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;

public class ImageIO_1 {
    public static void main(String[] args) {
        try {
            File file = new File("image.jpg");
            BufferedImage image = ImageIO.read(file);
            System.out.println("Image width: " + image.getWidth());
            System.out.println("Image height: " + image.getHeight());
        } catch (IOException e) {
            System.out.println("Error reading the image file.");
        }
    }
}
