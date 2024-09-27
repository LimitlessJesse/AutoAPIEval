import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import java.io.File;
import java.io.IOException;

public class ImageReader_3 {
    public static void main(String[] args) {
        try {
            File file = new File("path_to_your_image.jpg");
            ImageReader reader = ImageIO.getImageReadersByFormatName("jpg").next();
            reader.setInput(ImageIO.createImageInputStream(file));
            int height = reader.getHeight(0);
            System.out.println("Height of the image: " + height);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
