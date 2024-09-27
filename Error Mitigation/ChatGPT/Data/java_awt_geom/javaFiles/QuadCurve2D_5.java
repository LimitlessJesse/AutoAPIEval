import java.awt.geom.QuadCurve2D;

public class QuadCurve2D_5 {
    public static void main(String[] args) {
        QuadCurve2D curve = new QuadCurve2D.Double(0, 0, 50, 50, 100, 0);
        double x2 = curve.getX2();
        System.out.println("X coordinate of the end point: " + x2);
    }
}
