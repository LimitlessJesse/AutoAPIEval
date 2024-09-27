import java.awt.geom.CubicCurve2D;

public class CubicCurve2D_5 {
    public static void main(String[] args) {
        CubicCurve2D cubicCurve2D = new CubicCurve2D.Double(0, 0, 10, 10, 20, 20, 30, 30);
        double ctrlY2 = cubicCurve2D.getCtrlY2();
        System.out.println("The Y coordinate of the second control point is: " + ctrlY2);
    }
}
