import java.awt.geom.QuadCurve2D;

public class QuadCurve2D_Float_5 {
    public static void main(String[] args) {
        QuadCurve2D.Float curve = new QuadCurve2D.Float(0, 0, 50, 50, 100, 0);
        double x2 = curve.getX2();
        System.out.println("X coordinate of the end point: " + x2);
    }
}
