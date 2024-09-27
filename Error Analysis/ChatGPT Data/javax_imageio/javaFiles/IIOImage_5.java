import javax.imageio.metadata.IIOMetadata;
import javax.imageio.ImageIO;
import javax.imageio.IIOImage;

public class IIOImage_5 {
    public static void main(String[] args) {
        try {
            // Create an image
            BufferedImage image = ImageIO.read(new File("example.jpg"));
            IIOMetadata metadata = image.getMetadata();

            // Use IIOMetadata to access metadata information
            // For example, get the names of metadata formats
            String[] metadataFormats = metadata.getMetadataFormatNames();
            for (String format : metadataFormats) {
                System.out.println("Metadata format: " + format);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
