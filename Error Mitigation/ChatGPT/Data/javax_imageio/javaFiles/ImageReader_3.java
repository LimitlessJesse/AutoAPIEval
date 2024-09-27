import javax.imageio.ImageReader;
import javax.imageio.metadata.IIOMetadata;
import java.io.IOException;

public class ImageReader_3 {
    public static void main(String[] args) {
        ImageReader reader = null; // Initialize your ImageReader object here

        try {
            IIOMetadata metadata = reader.getImageMetadata(0); // Pass the image index here
            if (metadata != null) {
                // Process the metadata object
                System.out.println("Metadata found: " + metadata.toString());
            } else {
                System.out.println("No metadata available for the image.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred during reading: " + e.getMessage());
        }
    }
}
