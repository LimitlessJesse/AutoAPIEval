import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;

public class AffineTransform_5 {
    public static void main(String[] args) {
        AffineTransform transform = new AffineTransform();
        Point2D ptSrc = new Point2D.Double(10, 20);
        Point2D ptDst = new Point2D.Double();
        
        Point2D result = transform.transform(ptSrc, ptDst);
        
        System.out.println("Transformed point: " + result);
    }
}
