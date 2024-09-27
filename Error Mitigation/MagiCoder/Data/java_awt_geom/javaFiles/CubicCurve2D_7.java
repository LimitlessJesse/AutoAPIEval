import java.awt.geom.CubicCurve2D;

public class CubicCurve2D_7 {
    public static void main(String[] args) {
        CubicCurve2D cubicCurve2D = new CubicCurve2D.Double(0, 0, 1, 1, 2, 2, 3, 3);
        double y1 = cubicCurve2D.getY1();
        System.out.println("Y1 coordinate of the start point: " + y1);
    }
}
