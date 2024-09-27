import java.awt.geom.CubicCurve2D;

public class CubicCurve2D_9 {
    public static void main(String[] args) {
        CubicCurve2D curve = new CubicCurve2D.Double(0, 0, 1, 1, 2, 2, 3, 3);
        double y2 = curve.getY2();
        System.out.println("Y2 coordinate of the end point: " + y2);
    }
}
