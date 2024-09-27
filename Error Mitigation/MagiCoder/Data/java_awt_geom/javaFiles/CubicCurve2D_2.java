import java.awt.geom.CubicCurve2D;

public class CubicCurve2D_2 {
    public static void main(String[] args) {
        // Create a CubicCurve2D object
        CubicCurve2D cubicCurve = new CubicCurve2D.Double(0, 0, 10, 10, 20, 0, 30, 10);

        // Get the X coordinate of the first control point
        double ctrlX1 = cubicCurve.getCtrlX1();

        // Print the result
        System.out.println("The X coordinate of the first control point is: " + ctrlX1);
    }
}
