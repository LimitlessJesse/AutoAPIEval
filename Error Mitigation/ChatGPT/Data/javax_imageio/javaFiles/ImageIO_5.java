import javax.imageio.ImageIO;
import java.awt.image.RenderedImage;
import java.io.IOException;
import java.io.OutputStream;

public class ImageIO_5 {
    public static void main(String[] args) {
        RenderedImage image = null; // Initialize with your RenderedImage object
        String formatName = "PNG"; // Specify the format name
        OutputStream output = null; // Initialize with your OutputStream object
        
        try {
            boolean success = ImageIO.write(image, formatName, output);
            if(success) {
                System.out.println("Image successfully written.");
            } else {
                System.out.println("No appropriate writer found.");
            }
        } catch (IllegalArgumentException | IOException e) {
            e.printStackTrace();
        }
    }
}
