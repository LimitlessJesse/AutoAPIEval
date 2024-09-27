import java.awt.geom.QuadCurve2D;

public class QuadCurve2D_2 {
    public static void main(String[] args) {
        QuadCurve2D curve = new QuadCurve2D.Double(0, 0, 50, 100, 100, 0);
        double startY = curve.getY1();
        System.out.println("Start Y coordinate: " + startY);
    }
}
