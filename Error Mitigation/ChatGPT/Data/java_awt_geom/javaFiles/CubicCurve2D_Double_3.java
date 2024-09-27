import java.awt.geom.CubicCurve2D;

public class CubicCurve2D_Double_3 {
    public static void main(String[] args) {
        CubicCurve2D.Double curve = new CubicCurve2D.Double(0, 0, 50, 50, 100, 100, 150, 150);
        double ctrlX1 = curve.getCtrlX1();
        System.out.println("X coordinate of the first control point: " + ctrlX1);
    }
}
