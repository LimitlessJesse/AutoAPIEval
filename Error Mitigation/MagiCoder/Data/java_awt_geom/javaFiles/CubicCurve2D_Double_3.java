import java.awt.geom.CubicCurve2D;

public class CubicCurve2D_Double_3 {
    public static void main(String[] args) {
        CubicCurve2D.Double cubicCurve = new CubicCurve2D.Double(0, 0, 1, 1, 2, 2, 3, 3);
        double ctrlY1 = cubicCurve.getCtrlY1();
        System.out.println("Y coordinate of the first control point: " + ctrlY1);
    }
}
