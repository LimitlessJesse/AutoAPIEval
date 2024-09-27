import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import java.io.File;
import java.io.IOException;

public class ImageReader_3 {
    public static void main(String[] args) {
        try {
            File file = new File("path_to_your_image_file");
            ImageReader reader = ImageIO.createImageReaderIfNecessary(file);
            if (reader!= null) {
                reader.setInput(ImageIO.createImageInputStream(file));
                int numImages = reader.getNumImages(true);
                System.out.println("Number of images: " + numImages);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
