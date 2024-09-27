import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.awt.image.ImagingOpException;

public class AffineTransformOp_1 {
    public static void main(String[] args) {
        BufferedImage src = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        BufferedImage dst = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        
        AffineTransformOp op = new AffineTransformOp(null, AffineTransformOp.TYPE_BILINEAR);
        
        try {
            BufferedImage filteredImage = op.filter(src, dst);
            System.out.println("Filtered image: " + filteredImage);
        } catch (IllegalArgumentException | ImagingOpException e) {
            e.printStackTrace();
        }
    }
}
