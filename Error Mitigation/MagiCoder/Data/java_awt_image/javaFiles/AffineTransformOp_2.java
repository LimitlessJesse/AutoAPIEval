import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImageOp;

public class AffineTransformOp_2 {
    public static void main(String[] args) {
        BufferedImage src = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB);
        BufferedImage dst = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB);

        AffineTransform at = new AffineTransform();
        at.scale(1.5, 1.5);

        BufferedImageOp op = new AffineTransformOp(at, AffineTransformOp.TYPE_BILINEAR);
        dst = op.filter(src, dst);
    }
}
