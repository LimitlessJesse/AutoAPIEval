import java.awt.geom.Point2D;
import java.awt.image.AffineTransformOp;

public class AffineTransformOp_4 {
    public static void main(String[] args) {
        AffineTransformOp op = new AffineTransformOp(null, null);
        Point2D srcPt = new Point2D.Double(10.0, 20.0);
        Point2D dstPt = new Point2D.Double();
        Point2D result = op.getPoint2D(srcPt, dstPt);
        System.out.println("Result: " + result);
    }
}
