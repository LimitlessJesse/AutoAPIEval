import java.awt.geom.QuadCurve2D;

public class QuadCurve2D_Float_3 {
    public static void main(String[] args) {
        QuadCurve2D.Float curve = new QuadCurve2D.Float(0, 0, 50, 50, 100, 0);
        double ctrlX = curve.getCtrlX();
        System.out.println("Control point X coordinate: " + ctrlX);
    }
}
