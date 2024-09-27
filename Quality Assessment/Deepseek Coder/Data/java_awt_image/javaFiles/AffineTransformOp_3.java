import java.awt.image.BufferedImage;
import java.awt.image.AffineTransformOp;

public class AffineTransformOp_3 {
    public static void main(String[] args) {
        // Create a source BufferedImage
        BufferedImage src = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        
        // Create a destination BufferedImage
        BufferedImage dst = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        
        // Create an AffineTransformOp
        AffineTransformOp ato = new AffineTransformOp(AffineTransformOp.TYPE_BILINEAR, null);
        
        // Apply the filter
        dst = ato.filter(src, dst);
    }
}
