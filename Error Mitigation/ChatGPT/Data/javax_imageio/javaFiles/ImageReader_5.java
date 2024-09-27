import javax.imageio.ImageReader;
import javax.imageio.ImageTypeSpecifier;
import java.io.IOException;
import java.util.Iterator;

public class ImageReader_5 {
    public static void main(String[] args) {
        ImageReader imageReader = null; // Initialize your ImageReader object
        
        try {
            int imageIndex = 0; // Set the index of the image to be retrieved
            Iterator<ImageTypeSpecifier> imageTypes = imageReader.getImageTypes(imageIndex);
            
            while (imageTypes.hasNext()) {
                ImageTypeSpecifier imageTypeSpecifier = imageTypes.next();
                // Process the ImageTypeSpecifier as needed
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
