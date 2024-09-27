import java.awt.geom.Point2D;
import java.awt.geom.CubicCurve2D;

public class CubicCurve2D_Double_2 {
    public static void main(String[] args) {
        CubicCurve2D.Double curve = new CubicCurve2D.Double(10, 10, 20, 20, 30, 30, 40, 40);
        Point2D ctrlP1 = curve.getCtrlP1();
        System.out.println("Control point 1: (" + ctrlP1.getX() + ", " + ctrlP1.getY() + ")");
    }
}
