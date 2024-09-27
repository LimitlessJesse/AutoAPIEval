import java.awt.image.BufferedImage;
import java.awt.image.LookupOp;

public class LookupOp_1 {
    public static void main(String[] args) {
        // Create your source BufferedImage
        BufferedImage src = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB);

        // Create your destination BufferedImage
        BufferedImage dest = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB);

        // Create a LookupOp object
        LookupOp op = new LookupOp(null, null);

        // Apply the filter
        op.filter(src, dest);
    }
}
