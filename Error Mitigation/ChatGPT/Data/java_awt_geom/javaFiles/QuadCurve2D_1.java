import java.awt.geom.QuadCurve2D;

public class QuadCurve2D_1 {
    public static void main(String[] args) {
        QuadCurve2D curve = new QuadCurve2D.Double(0, 0, 50, 100, 100, 0);
        double x1 = curve.getX1();
        System.out.println("X coordinate of the start point: " + x1);
    }
}
