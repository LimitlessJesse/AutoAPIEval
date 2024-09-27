import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class BufferedImage_3 {
    public static void main(String[] args) {
        try {
            BufferedImage image = ImageIO.read(new File("path_to_your_image.jpg"));
            int height = image.getHeight();
            System.out.println("Height of the image: " + height);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
