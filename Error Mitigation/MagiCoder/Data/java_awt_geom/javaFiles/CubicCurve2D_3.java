import java.awt.geom.CubicCurve2D;

public class CubicCurve2D_3 {
    public static void main(String[] args) {
        // Create a CubicCurve2D object
        CubicCurve2D cubicCurve = new CubicCurve2D.Double(0, 0, 10, 10, 20, 0, 30, 10);

        // Get the Y coordinate of the first control point
        double ctrlY1 = cubicCurve.getCtrlY1();

        // Print the result
        System.out.println("Y coordinate of the first control point: " + ctrlY1);
    }
}
