import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageReader_7 {
    public static void main(String[] args) {
        try {
            File file = new File("path_to_your_image_file");
            BufferedImage image = ImageIO.read(file);
            ImageReader reader = ImageIO.getImageReadersByFormatName("jpg").next();
            reader.setInput(ImageIO.createImageInputStream(file));
            int height = reader.getHeight(0);
            System.out.println("Height of the image: " + height);
        } catch (IOException | IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}
