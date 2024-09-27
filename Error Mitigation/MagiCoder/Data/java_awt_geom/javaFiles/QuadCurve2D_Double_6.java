import java.awt.geom.QuadCurve2D;

public class QuadCurve2D_Double_6 {
    public static void main(String[] args) {
        QuadCurve2D.Double quadCurve = new QuadCurve2D.Double(0, 0, 10, 10, 20, 20);
        double x2 = quadCurve.getX2();
        System.out.println("X coordinate of the end point: " + x2);
    }
}
