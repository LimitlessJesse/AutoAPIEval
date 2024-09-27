import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import java.io.File;
import java.io.IOException;

public class ImageReader_1 {
    public static void main(String[] args) {
        try {
            ImageInputStream iis = ImageIO.createImageInputStream(new File("image.jpg"));
            ImageReader reader = ImageIO.getImageReaders(iis).next();
            reader.setInput(iis);
            System.out.println(reader.getDefaultReadParam());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
