import java.awt.geom.QuadCurve2D;

public class QuadCurve2D_Double_2 {
    public static void main(String[] args) {
        QuadCurve2D.Double curve = new QuadCurve2D.Double(0, 0, 50, 50, 100, 0);
        double startY = curve.getY1();
        System.out.println("Start Y coordinate: " + startY);
    }
}
