import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.ImageTypeSpecifier;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

public class ImageReader_1 {
    public static void main(String[] args) {
        try {
            File file = new File("image.jpg");
            ImageReader reader = ImageIO.getImageReadersByFormatName("JPEG").next();
            reader.setInput(ImageIO.createImageInputStream(file));
            Iterator<ImageTypeSpecifier> imageTypes = reader.getImageTypes(0);
            while (imageTypes.hasNext()) {
                ImageTypeSpecifier type = imageTypes.next();
                System.out.println(type);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
