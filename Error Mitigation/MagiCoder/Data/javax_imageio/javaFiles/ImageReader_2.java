import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import java.io.File;
import java.io.IOException;

public class ImageReader_2 {
    public static void main(String[] args) {
        try {
            File file = new File("path_to_your_image.jpg");
            ImageReader reader = ImageIO.getImageReadersByFormatName("jpg").next();
            reader.setInput(ImageIO.createImageInputStream(file));
            int width = reader.getWidth(0);
            System.out.println("Width of the image: " + width);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
