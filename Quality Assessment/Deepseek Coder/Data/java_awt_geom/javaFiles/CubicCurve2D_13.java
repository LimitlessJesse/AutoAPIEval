import java.awt.geom.CubicCurve2D;

public class CubicCurve2D_13 {
    public static void main(String[] args) {
        // Create a CubicCurve2D object
        CubicCurve2D cubicCurve = new CubicCurve2D.Float(0, 0, 10, 10, 20, 0, 30, 10);

        // Use the intersects method
        boolean intersects = cubicCurve.intersects(5, 5, 10, 10);

        // Print the result
        System.out.println("Does the rectangle intersect with the curve? " + intersects);
    }
}
