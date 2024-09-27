import java.awt.geom.CubicCurve2D;

public class CubicCurve2D_Double_9 {
    public static void main(String[] args) {
        CubicCurve2D.Double cubicCurve = new CubicCurve2D.Double(0, 0, 1, 1, 2, 2, 3, 3);
        double y2 = cubicCurve.getY2();
        System.out.println("Y2 coordinate of the end point: " + y2);
    }
}
