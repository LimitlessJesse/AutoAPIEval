import java.awt.geom.CubicCurve2D;

public class CubicCurve2D_2 {
    public static void main(String[] args) {
        CubicCurve2D curve = new CubicCurve2D.Double(0, 0, 50, 50, 100, 100, 150, 150);
        double startY = curve.getY1();
        System.out.println("Start Y coordinate: " + startY);
    }
}
