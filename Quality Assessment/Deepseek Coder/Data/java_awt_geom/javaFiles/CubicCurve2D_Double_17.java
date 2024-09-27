import java.awt.geom.CubicCurve2D;
import java.awt.geom.Rectangle2D;

public class CubicCurve2D_Double_17 {
    public static void main(String[] args) {
        // Create a CubicCurve2D.Double object
        CubicCurve2D.Double cubicCurve = new CubicCurve2D.Double(
                10, 10,  // Point 1
                20, 20,  // Point 2
                30, 30,  // Point 3
                40, 40); // Point 4

        // Get the bounds of the cubic curve
        Rectangle2D bounds = cubicCurve.getBounds2D();

        // Print the bounds
        System.out.println("X: " + bounds.getX());
        System.out.println("Y: " + bounds.getY());
        System.out.println("Width: " + bounds.getWidth());
        System.out.println("Height: " + bounds.getHeight());
    }
}
