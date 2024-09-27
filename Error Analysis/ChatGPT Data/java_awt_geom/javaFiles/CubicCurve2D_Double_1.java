import java.awt.geom.CubicCurve2D;

public class CubicCurve2D_Double_1 {
    public static void main(String[] args) {
        CubicCurve2D.Double curve = new CubicCurve2D.Double(0, 0, 50, 50, 100, 50, 150, 0);
        System.out.println("P1 Point: (" + curve.getP1().getX() + ", " + curve.getP1().getY() + ")");
    }
}
