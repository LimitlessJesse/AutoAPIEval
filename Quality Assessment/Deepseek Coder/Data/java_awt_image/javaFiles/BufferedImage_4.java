import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;

public class BufferedImage_4 {
    public static void main(String[] args) {
        BufferedImage bufferedImage = new BufferedImage(10, 10, BufferedImage.TYPE_INT_RGB);
        ColorModel colorModel = bufferedImage.getColorModel();
        System.out.println(colorModel);
    }
}
