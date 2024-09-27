import java.awt.geom.AffineTransform;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.PathIterator;

public class CubicCurve2D_15 {
    public static void main(String[] args) {
        // Create a CubicCurve2D
        CubicCurve2D cubicCurve = new CubicCurve2D.Float(0, 0, 10, 10, 20, 0, 30, 10);

        // Create an AffineTransform
        AffineTransform at = new AffineTransform();

        // Apply a transformation to the AffineTransform
        at.translate(10, 10);

        // Get the PathIterator with the specified AffineTransform and flatness
        PathIterator pi = cubicCurve.getPathIterator(at, 1.0);

        // Print the PathIterator
        System.out.println(pi);
    }
}
