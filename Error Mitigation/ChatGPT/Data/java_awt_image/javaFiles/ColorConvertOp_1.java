import java.awt.image.BufferedImage;
import java.awt.image.ColorConvertOp;

public class ColorConvertOp_1 {
    public static void main(String[] args) {
        BufferedImage src = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        BufferedImage dest = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);

        ColorConvertOp op = new ColorConvertOp(null);
        BufferedImage convertedImage = op.filter(src, dest);

        System.out.println("Source Image: " + src);
        System.out.println("Converted Image: " + convertedImage);
    }
}
