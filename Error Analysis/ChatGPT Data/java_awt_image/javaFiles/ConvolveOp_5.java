import java.awt.geom.Point2D;
import java.awt.image.ConvolveOp;

public class ConvolveOp_5 {
    public static void main(String[] args) {
        Point2D srcPt = new Point2D.Double(10.0, 20.0);
        Point2D dstPt = new Point2D.Double();
        
        ConvolveOp op = new ConvolveOp(null); // Create ConvolveOp object with null kernel for demonstration
        
        Point2D result = op.getPoint2D(srcPt, dstPt);
        
        System.out.println("Resulting Point: (" + result.getX() + ", " + result.getY() + ")");
    }
}
