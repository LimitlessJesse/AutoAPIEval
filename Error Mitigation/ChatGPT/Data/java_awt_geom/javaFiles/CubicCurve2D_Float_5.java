import java.awt.geom.CubicCurve2D;

public class CubicCurve2D_Float_5 {
    public static void main(String[] args) {
        CubicCurve2D.Float curve = new CubicCurve2D.Float(0, 0, 50, 50, 100, 100, 150, 150);
        double ctrlX2 = curve.getCtrlX2();
        System.out.println("X coordinate of the second control point: " + ctrlX2);
    }
}
