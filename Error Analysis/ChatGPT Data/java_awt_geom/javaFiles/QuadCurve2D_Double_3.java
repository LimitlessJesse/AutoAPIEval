import java.awt.geom.Point2D;
import java.awt.geom.QuadCurve2D;

public class QuadCurve2D_Double_3 {
    public static void main(String[] args) {
        QuadCurve2D.Double curve = new QuadCurve2D.Double(0, 0, 50, 100, 100, 0);
        Point2D p2 = curve.getP2();
        System.out.println("P2 coordinates: (" + p2.getX() + ", " + p2.getY() + ")");
    }
}
