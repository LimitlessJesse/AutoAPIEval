import java.awt.geom.Point2D;
import java.awt.geom.QuadCurve2D;

public class QuadCurve2D_Double_1 {
    public static void main(String[] args) {
        QuadCurve2D.Double curve = new QuadCurve2D.Double(0, 0, 50, 100, 100, 0);
        Point2D p1 = curve.getP1();
        System.out.println("P1: " + p1.getX() + ", " + p1.getY());
    }
}
