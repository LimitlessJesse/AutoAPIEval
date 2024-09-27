import java.awt.geom.CubicCurve2D;

public class CubicCurve2D_Float_5 {
    public static void main(String[] args) {
        CubicCurve2D.Float cubicCurve = new CubicCurve2D.Float(1.0f, 2.0f, 3.0f, 4.0f, 5.0f, 6.0f, 7.0f, 8.0f);
        System.out.println("Control Point 2: " + cubicCurve.getCtrlP2());
    }
}
