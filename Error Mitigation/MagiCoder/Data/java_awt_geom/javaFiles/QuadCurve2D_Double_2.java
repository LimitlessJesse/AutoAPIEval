import java.awt.geom.QuadCurve2D;

public class QuadCurve2D_Double_2 {
    public static void main(String[] args) {
        QuadCurve2D.Double quadCurve = new QuadCurve2D.Double(1.0, 2.0, 3.0, 4.0, 5.0, 6.0);
        double ctrlX = quadCurve.getCtrlX();
        System.out.println("X coordinate of the control point: " + ctrlX);
    }
}
