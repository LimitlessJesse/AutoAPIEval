import java.awt.geom.QuadCurve2D;

public class QuadCurve2D_Float_5 {
    public static void main(String[] args) {
        QuadCurve2D.Float curve = new QuadCurve2D.Float();
        curve.setCurve(10.0f, 10.0f, 20.0f, 30.0f, 40.0f, 50.0f);
        System.out.println(curve);
    }
}
