import java.awt.geom.QuadCurve2D;

public class QuadCurve2D_Double_4 {
    public static void main(String[] args) {
        QuadCurve2D.Double curve = new QuadCurve2D.Double();
        curve.setCurve(0.0, 0.0, 1.0, 1.0, 2.0, 2.0);
        System.out.println("Curve control points set successfully.");
    }
}
