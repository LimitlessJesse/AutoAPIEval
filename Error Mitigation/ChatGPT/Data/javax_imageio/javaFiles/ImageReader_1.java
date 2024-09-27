import javax.imageio.ImageReader;
import java.io.IOException;

public class ImageReader_1 {
    public static void main(String[] args) {
        ImageReader imageReader = null; // Initialize your ImageReader object
        
        try {
            int numImages = imageReader.getNumImages(true);
            System.out.println("Number of images: " + numImages);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
