import java.awt.geom.CubicCurve2D;
import java.awt.geom.Point2D;

public class CubicCurve2D_2 {
    public static void main(String[] args) {
        CubicCurve2D curve = new CubicCurve2D.Double(0, 0, 50, 50, 100, 100, 150, 0);
        Point2D p2 = curve.getP2();
        System.out.println("P2 x-coordinate: " + p2.getX());
        System.out.println("P2 y-coordinate: " + p2.getY());
    }
}
