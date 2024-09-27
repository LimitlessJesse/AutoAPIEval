import java.awt.geom.CubicCurve2D;
import java.awt.geom.Point2D;

public class CubicCurve2D_3 {
    public static void main(String[] args) {
        CubicCurve2D curve = new CubicCurve2D.Double(0, 0, 50, 50, 100, 100, 150, 150);
        Point2D controlPoint1 = curve.getCtrlP1();
        System.out.println("Control Point 1: (" + controlPoint1.getX() + ", " + controlPoint1.getY() + ")");
    }
}
