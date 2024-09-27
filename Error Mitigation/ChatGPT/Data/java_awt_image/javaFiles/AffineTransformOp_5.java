import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.awt.geom.Rectangle2D;

public class AffineTransformOp_5 {
    public static void main(String[] args) {
        BufferedImage src = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB);
        AffineTransformOp op = new AffineTransformOp(null, AffineTransformOp.TYPE_BILINEAR);
        Rectangle2D bounds = op.getBounds2D(src);
        System.out.println("Bounding Box: " + bounds);
    }
}
