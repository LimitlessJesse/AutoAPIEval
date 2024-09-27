import java.awt.image.BufferedImage;
import java.awt.image.RescaleOp;
import java.awt.geom.Rectangle2D;

public class RescaleOp_5 {
    public static void main(String[] args) {
        BufferedImage src = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB);
        RescaleOp rescaleOp = new RescaleOp(1.5f, 0.0f, null);
        Rectangle2D bounds = rescaleOp.getBounds2D(src);
        System.out.println("Bounding box: " + bounds);
    }
}
