import java.awt.geom.CubicCurve2D;

public class CubicCurve2D_6 {
    public static void main(String[] args) {
        CubicCurve2D cubicCurve = new CubicCurve2D.Double(0, 0, 1, 1, 2, 2, 3, 3);
        double x1 = cubicCurve.getX1();
        System.out.println("X coordinate of the start point: " + x1);
    }
}
