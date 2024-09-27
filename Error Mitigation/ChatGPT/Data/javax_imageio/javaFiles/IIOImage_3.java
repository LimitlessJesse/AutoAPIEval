import javax.imageio.IIOImage;
import javax.imageio.metadata.IIOMetadata;

public class IIOImage_3 {
    public static void main(String[] args) {
        // Create an IIOImage object
        IIOImage image = new IIOImage();

        // Get the metadata associated with the image
        IIOMetadata metadata = image.getMetadata();

        // Print the metadata object
        System.out.println(metadata);
    }
}
