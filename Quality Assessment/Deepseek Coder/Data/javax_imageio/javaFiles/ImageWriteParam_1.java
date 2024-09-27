import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageWriteParam_1 {
    public static void main(String[] args) {
        try {
            BufferedImage image = ImageIO.read(new File("input.jpg"));

            File output = new File("output.jpg");
            ImageWriter writer = ImageIO.getImageWritersByFormatName("jpg").next();
            ImageWriteParam param = writer.getDefaultWriteParam();

            // Set the compression mode to maximum compression
            param.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
            param.setCompressionQuality(0f); // 0f is maximum compression

            writer.setOutput(ImageIO.createImageOutputStream(output));
            writer.write(null, new IIOImage(image, null, null), param);
            writer.dispose();

            System.out.println("Image compressed successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
