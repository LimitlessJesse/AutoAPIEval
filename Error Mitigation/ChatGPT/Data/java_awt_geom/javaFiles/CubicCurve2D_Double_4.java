import java.awt.geom.CubicCurve2D;

public class CubicCurve2D_Double_4 {
    public static void main(String[] args) {
        CubicCurve2D.Double curve = new CubicCurve2D.Double(0, 0, 50, 50, 100, 100, 150, 150);
        double ctrlY1 = curve.getCtrlY1();
        System.out.println("Y coordinate of the first control point: " + ctrlY1);
    }
}
