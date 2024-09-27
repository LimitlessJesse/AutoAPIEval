import java.awt.geom.CubicCurve2D;

public class CubicCurve2D_Double_1 {
    public static void main(String[] args) {
        CubicCurve2D.Double cubicCurve = new CubicCurve2D.Double(1, 2, 3, 4, 5, 6, 7, 8);
        double ctrlX1 = cubicCurve.getCtrlX1();
        System.out.println("The x-coordinate of the first control point is: " + ctrlX1);
    }
}
