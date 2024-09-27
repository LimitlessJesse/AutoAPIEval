import java.awt.geom.CubicCurve2D;

public class CubicCurve2D_4 {
    public static void main(String[] args) {
        // Create a CubicCurve2D object
        CubicCurve2D cubicCurve = new CubicCurve2D.Double(0, 0, 1, 1, 2, 2, 3, 3);

        // Get the X coordinate of the second control point
        double ctrlX2 = cubicCurve.getCtrlX2();

        // Print the result
        System.out.println("The X coordinate of the second control point is: " + ctrlX2);
    }
}
