import java.awt.geom.CubicCurve2D;

public class CubicCurve2D_Double_4 {
    public static void main(String[] args) {
        CubicCurve2D.Double cubicCurve = new CubicCurve2D.Double(0, 0, 1, 1, 2, 2, 3, 3);
        double ctrlX2 = cubicCurve.getCtrlX2();
        System.out.println("The X coordinate of the second control point is: " + ctrlX2);
    }
}
