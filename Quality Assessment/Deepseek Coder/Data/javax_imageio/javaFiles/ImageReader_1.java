import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import java.io.File;
import java.io.IOException;

public class ImageReader_1 {
    public static void main(String[] args) {
        try {
            File input = new File("path_to_your_image_file");
            ImageInputStream in = ImageIO.createImageInputStream(input);
            ImageReader reader = ImageIO.getImageReaders(in).next();
            reader.setInput(in);
            ImageReadParam param = reader.getDefaultReadParam();
            // You can now use the param object to read the image
            // For example, you can set the source region of interest
            // param.setSourceRegion(new Rectangle(x, y, width, height));
            // Then you can read the image using the reader and the param
            // BufferedImage image = reader.read(0, param);
        } catch (IOException | IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}
