import java.awt.geom.CubicCurve2D;

public class CubicCurve2D_Float_7 {
    public static void main(String[] args) {
        CubicCurve2D.Float cubicCurve = new CubicCurve2D.Float();
        cubicCurve.setCurve(10, 20, 30, 40, 50, 60, 70, 80);
        System.out.println(cubicCurve);
    }
}
