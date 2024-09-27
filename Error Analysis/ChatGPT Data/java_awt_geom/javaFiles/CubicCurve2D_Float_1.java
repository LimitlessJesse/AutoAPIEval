import java.awt.geom.CubicCurve2D;

public class CubicCurve2D_Float_1 {
    public static void main(String[] args) {
        CubicCurve2D.Float curve = new CubicCurve2D.Float();
        curve.setCurve(0.0f, 0.0f, 50.0f, 50.0f, 100.0f, 50.0f, 150.0f, 0.0f);
        System.out.println(curve);
    }
}
