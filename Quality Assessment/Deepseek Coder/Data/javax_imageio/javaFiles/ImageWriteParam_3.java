import javax.imageio.ImageWriteParam;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageWriteParam_3 {
    public static void main(String[] args) {
        try {
            // Create a new BufferedImage
            BufferedImage image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);

            // Create a new ImageWriteParam
            ImageWriteParam param = ImageIO.createImageWriter("output.jpg").getDefaultWriteParam();

            // Set the progressive mode
            param.setProgressiveMode(ImageWriteParam.MODE_DEFAULT);

            // Write the image
            ImageIO.write(image, "jpg", new File("output.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
