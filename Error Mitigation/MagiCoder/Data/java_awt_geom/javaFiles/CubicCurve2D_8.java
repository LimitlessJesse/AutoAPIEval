import java.awt.geom.CubicCurve2D;

public class CubicCurve2D_8 {
    public static void main(String[] args) {
        CubicCurve2D curve = new CubicCurve2D.Double(0, 0, 1, 1, 2, 2, 3, 3);
        double x2 = curve.getX2();
        System.out.println("X2 coordinate of the end point: " + x2);
    }
}
