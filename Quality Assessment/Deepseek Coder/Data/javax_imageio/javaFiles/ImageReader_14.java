import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import java.awt.image.ImageProducer;
import java.io.IOException;
import java.util.Iterator;

public class ImageReader_14 {
    public static void main(String[] args) {
        try {
            Iterator<ImageTypeSpecifier> imageTypes;
            ImageReader reader = ImageIO.getImageReadersByFormatName("jpg").next();
            ImageProducer ip = reader.getImageProducer();
            imageTypes = reader.getImageTypes(100);

            while(imageTypes.hasNext()) {
                ImageTypeSpecifier type = imageTypes.next();
                System.out.println(type.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
