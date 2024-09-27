import java.awt.Color;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.geom.AffineTransformOp;

public class AffineTransformOp_5 {
    public static void main(String[] args) {
        BufferedImage src = new BufferedImage(10, 10, BufferedImage.TYPE_INT_RGB);
        ColorModel cm = src.getColorModel();
        AffineTransformOp op = new AffineTransformOp(null, null);
        BufferedImage dest = op.createCompatibleDestImage(src, cm);
    }
}
