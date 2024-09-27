import java.awt.geom.CubicCurve2D;

public class CubicCurve2D_Double_2 {
    public static void main(String[] args) {
        CubicCurve2D.Double cubicCurve = new CubicCurve2D.Double(1, 2, 3, 4, 5, 6, 7, 8);
        double ctrlY1 = cubicCurve.getCtrlY1();
        System.out.println("The y-coordinate of the second control point is: " + ctrlY1);
    }
}
