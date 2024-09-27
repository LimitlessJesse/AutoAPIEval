import java.awt.geom.CubicCurve2D;

public class CubicCurve2D_Float_2 {
    public static void main(String[] args) {
        CubicCurve2D.Float curve = new CubicCurve2D.Float(0.0f, 0.0f, 50.0f, 50.0f, 100.0f, 0.0f, 150.0f, 50.0f);
        double startY = curve.getY1();
        System.out.println("Start Y coordinate: " + startY);
    }
}
