import java.awt.geom.QuadCurve2D;

public class QuadCurve2D_Double_1 {
    public static void main(String[] args) {
        QuadCurve2D.Double curve = new QuadCurve2D.Double(0, 0, 50, 50, 100, 0);
        double x1 = curve.getX1();
        System.out.println("X coordinate of the start point: " + x1);
    }
}
