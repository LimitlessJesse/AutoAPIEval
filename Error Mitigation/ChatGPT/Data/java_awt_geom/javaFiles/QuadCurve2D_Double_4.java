import java.awt.geom.QuadCurve2D;

public class QuadCurve2D_Double_4 {
    public static void main(String[] args) {
        QuadCurve2D.Double curve = new QuadCurve2D.Double(0, 0, 50, 100, 100, 0);
        double ctrlY = curve.getCtrlY();
        System.out.println("Control Point Y Coordinate: " + ctrlY);
    }
}
