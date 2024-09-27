import java.awt.geom.CubicCurve2D;

public class CubicCurve2D_1 {
    public static void main(String[] args) {
        CubicCurve2D curve = new CubicCurve2D.Double(0, 0, 50, 50, 100, 100, 150, 150);
        double x1 = curve.getX1();
        System.out.println("X coordinate of the start point: " + x1);
    }
}
