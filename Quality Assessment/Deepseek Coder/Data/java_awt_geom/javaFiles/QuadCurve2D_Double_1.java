import java.awt.geom.QuadCurve2D;

public class QuadCurve2D_Double_1 {
    public static void main(String[] args) {
        QuadCurve2D.Double curve = new QuadCurve2D.Double();
        curve.setCurve(10, 20, 30, 40, 50, 60);
        System.out.println("Curve: " + curve);
    }
}
