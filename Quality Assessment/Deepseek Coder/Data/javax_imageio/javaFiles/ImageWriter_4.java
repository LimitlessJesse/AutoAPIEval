import javax.imageio.ImageIO;
import javax.imageio.ImageWriter;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageWriter_4 {
    public static void main(String[] args) {
        BufferedImage image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        File outputFile = new File("output.jpg");

        try {
            ImageWriter writer = ImageIO.getImageWritersByFormatName("jpg").next();
            writer.setOutput(ImageIO.createImageOutputStream(outputFile));
            writer.write(image);

            // Dispose the ImageWriter
            writer.dispose();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
