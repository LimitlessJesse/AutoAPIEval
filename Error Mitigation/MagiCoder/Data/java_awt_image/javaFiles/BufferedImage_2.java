import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class BufferedImage_2 {
    public static void main(String[] args) {
        try {
            BufferedImage image = ImageIO.read(new File("path_to_your_image.jpg"));
            int width = image.getWidth();
            System.out.println("Width of the image: " + width);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
