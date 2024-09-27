import java.awt.geom.CubicCurve2D;

public class CubicCurve2D_Double_8 {
    public static void main(String[] args) {
        CubicCurve2D.Double cubicCurve = new CubicCurve2D.Double(0, 0, 1, 1, 2, 2, 3, 3);
        double x2 = cubicCurve.getX2();
        System.out.println("X coordinate of the end point: " + x2);
    }
}
