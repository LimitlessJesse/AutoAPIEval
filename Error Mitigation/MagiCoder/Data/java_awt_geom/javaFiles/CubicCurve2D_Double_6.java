import java.awt.geom.CubicCurve2D;

public class CubicCurve2D_Double_6 {
    public static void main(String[] args) {
        CubicCurve2D.Double cubicCurve = new CubicCurve2D.Double(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0);
        double x1 = cubicCurve.getX1();
        System.out.println("X1: " + x1);
    }
}
