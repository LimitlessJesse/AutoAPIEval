import javax.imageio.ImageTypeSpecifier;
import java.awt.image.ColorModel;

public class ImageTypeSpecifier_2 {
    public static void main(String[] args) {
        ImageTypeSpecifier imageTypeSpecifier = new ImageTypeSpecifier();
        ColorModel colorModel = imageTypeSpecifier.getColorModel();
        System.out.println(colorModel);
    }
}
