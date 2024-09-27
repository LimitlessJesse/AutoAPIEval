import java.awt.geom.*;

public class CubicCurve2D_Float_3 {
    public static void main(String[] args) {
        CubicCurve2D.Float curve = new CubicCurve2D.Float(0, 0, 50, 50, 100, 100, 150, 150);
        Point2D p2 = curve.getP2();
        System.out.println("P2 coordinates: (" + p2.getX() + ", " + p2.getY() + ")");
    }
}
