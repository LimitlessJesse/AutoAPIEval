import java.awt.geom.Point2D;
import java.awt.image.RescaleOp;

public class RescaleOp_4 {
    public static void main(String[] args) {
        RescaleOp rescaleOp = new RescaleOp(1.0f, 0.0f, null);
        Point2D srcPt = new Point2D.Double(10.0, 20.0);
        Point2D dstPt = new Point2D.Double();
        Point2D result = rescaleOp.getPoint2D(srcPt, dstPt);
        System.out.println("Result: " + result);
    }
}
