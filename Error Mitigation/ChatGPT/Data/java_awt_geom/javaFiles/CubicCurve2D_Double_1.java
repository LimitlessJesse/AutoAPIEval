import java.awt.geom.CubicCurve2D;

public class CubicCurve2D_Double_1 {
    public static void main(String[] args) {
        CubicCurve2D.Double curve = new CubicCurve2D.Double(0, 0, 10, 10, 20, 20, 30, 30);
        double x1 = curve.getX1();
        System.out.println("X coordinate of the start point: " + x1);
    }
}
