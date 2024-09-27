import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageWriteParam_2 {
    public static void main(String[] args) {
        try {
            BufferedImage image = ImageIO.read(new File("input.jpg"));
            ImageWriter writer = ImageIO.getImageWritersByFormatName("jpg").next();
            ImageWriteParam param = writer.getDefaultWriteParam();
            param.setCompressionQuality(0.5f); // Set the compression quality to 50%
            writer.setOutput(ImageIO.createImageOutputStream(new File("output.jpg")));
            writer.write(null, new IIOImage(image, null, null), param);
            writer.dispose();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
