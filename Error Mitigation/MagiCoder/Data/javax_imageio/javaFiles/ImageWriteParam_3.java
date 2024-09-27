import javax.imageio.ImageWriteParam;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImageWriteParam_3 {
    public static void main(String[] args) {
        try {
            BufferedImage img = ImageIO.read(new File("input.jpg"));
            ImageWriteParam param = ImageIO.getImageWritersByFormatName("jpg").next().getDefaultWriteParam();
            param.setProgressiveMode(ImageWriteParam.MODE_DEFAULT);
            ImageIO.write(img, "jpg", new File("output.jpg"), param);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
