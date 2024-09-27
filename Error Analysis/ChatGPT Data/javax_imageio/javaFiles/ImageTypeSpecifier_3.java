import javax.imageio.ImageTypeSpecifier;
import java.awt.color.ColorModel;

public class ImageTypeSpecifier_3 {
    public static void main(String[] args) {
        ImageTypeSpecifier its = ImageTypeSpecifier.createFromBufferedImageType(BufferedImage.TYPE_INT_RGB);
        ColorModel colorModel = its.getColorModel();
        System.out.println(colorModel);
    }
}
