import java.awt.geom.AffineTransform;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.PathIterator;

public class CubicCurve2D_14 {
    public static void main(String[] args) {
        // Create a CubicCurve2D object
        CubicCurve2D cubicCurve = new CubicCurve2D.Float(0, 0, 10, 10, 20, 0, 30, 10);

        // Create an AffineTransform object
        AffineTransform at = new AffineTransform();

        // Get the PathIterator
        PathIterator pi = cubicCurve.getPathIterator(at);

        // Print the PathIterator
        System.out.println(pi);
    }
}
