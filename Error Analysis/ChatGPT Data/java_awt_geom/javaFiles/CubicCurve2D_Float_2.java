import java.awt.geom.CubicCurve2D;

public class CubicCurve2D_Float_2 {
    public static void main(String[] args) {
        CubicCurve2D.Float curve = new CubicCurve2D.Float(0, 0, 50, 50, 100, 100, 150, 150);

        System.out.println("P1 Point: (" + curve.getP1().getX() + ", " + curve.getP1().getY() + ")");
    }
}
