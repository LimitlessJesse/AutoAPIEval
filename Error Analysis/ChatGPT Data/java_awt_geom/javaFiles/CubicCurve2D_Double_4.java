import java.awt.geom.CubicCurve2D;

public class CubicCurve2D_Double_4 {
    public static void main(String[] args) {
        CubicCurve2D.Double curve = new CubicCurve2D.Double(0, 0, 50, 50, 100, 0, 150, 50);
        System.out.println("P2(x,y): " + curve.getP2());
    }
}
