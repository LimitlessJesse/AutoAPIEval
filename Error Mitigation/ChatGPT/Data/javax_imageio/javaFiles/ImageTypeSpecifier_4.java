import javax.imageio.ImageTypeSpecifier;
import java.awt.image.BufferedImage;

public class ImageTypeSpecifier_4 {
    public static void main(String[] args) {
        ImageTypeSpecifier imageTypeSpecifier = ImageTypeSpecifier.createFromBufferedImageType(BufferedImage.TYPE_INT_ARGB);
        int bufferedImageType = imageTypeSpecifier.getBufferedImageType();
        System.out.println("BufferedImage type: " + bufferedImageType);
    }
}
