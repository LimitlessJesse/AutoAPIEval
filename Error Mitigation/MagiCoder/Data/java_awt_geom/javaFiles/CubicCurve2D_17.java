import java.awt.geom.CubicCurve2D;

public class CubicCurve2D_17 {
    public static void main(String[] args) {
        // Create a CubicCurve2D object
        CubicCurve2D cubicCurve = new CubicCurve2D.Double(0, 0, 1, 1, 2, 0, 3, 0);

        // Get the flatness of the curve
        double flatness = cubicCurve.getFlatness();

        // Print the flatness
        System.out.println("Flatness: " + flatness);
    }
}
