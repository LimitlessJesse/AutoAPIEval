import java.awt.geom.CubicCurve2D;

public class CubicCurve2D_Double_4 {
    public static void main(String[] args) {
        CubicCurve2D.Double cubicCurve = new CubicCurve2D.Double(1, 1, 2, 2, 3, 3, 4, 4);
        double ctrlY2 = cubicCurve.getCtrlY2();
        System.out.println("The y-coordinate of the second control point is: " + ctrlY2);
    }
}
