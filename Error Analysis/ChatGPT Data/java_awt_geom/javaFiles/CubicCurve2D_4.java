import java.awt.geom.CubicCurve2D;

public class CubicCurve2D_4 {
    public static void main(String[] args) {
        CubicCurve2D curve = new CubicCurve2D.Float(0, 0, 50, 100, 150, 100, 200, 0);

        System.out.println("Control Point 2: (" + curve.getCtrlX2() + ", " + curve.getCtrlY2() + ")");
    }
}
