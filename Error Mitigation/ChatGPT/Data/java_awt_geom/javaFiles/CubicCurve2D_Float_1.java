import java.awt.geom.CubicCurve2D;

public class CubicCurve2D_Float_1 {
    public static void main(String[] args) {
        CubicCurve2D.Float curve = new CubicCurve2D.Float(0, 0, 50, 50, 100, 100, 150, 150);
        double startX = curve.getX1();
        System.out.println("Start X coordinate: " + startX);
    }
}
