import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ImageIO_1 {
    public static void main(String[] args) {
        try {
            // Create an InputStream to read the image file
            InputStream in = new FileInputStream("path_to_your_image_file");

            // Use ImageIO to read the image from the InputStream
            BufferedImage image = ImageIO.read(in);

            // Close the InputStream
            in.close();

            // Now you can use the BufferedImage object
            // For example, you can get its width and height
            int width = image.getWidth();
            int height = image.getHeight();

            System.out.println("Image width: " + width);
            System.out.println("Image height: " + height);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
