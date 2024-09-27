import java.awt.image.BufferedImage;
import java.awt.image.ColorConvertOp;
import java.awt.image.ColorModel;

public class ColorConvertOp_1 {
    public static void main(String[] args) {
        BufferedImage src = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        BufferedImage dest = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);

        ColorConvertOp op = new ColorConvertOp(src.getColorModel().getColorSpace(), dest.getColorModel().getColorSpace(), null);
        op.filter(src, dest);

        // Display or further process the filtered BufferedImage 'dest'
    }
}
