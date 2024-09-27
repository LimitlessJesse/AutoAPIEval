import java.awt.geom.CubicCurve2D;

public class CubicCurve2D_1 {
    public static void main(String[] args) {
        CubicCurve2D cubicCurve = new CubicCurve2D.Float();
        cubicCurve.setCurve(10, 10, 20, 20, 30, 30, 40, 40);
        System.out.println(cubicCurve);
    }
}
