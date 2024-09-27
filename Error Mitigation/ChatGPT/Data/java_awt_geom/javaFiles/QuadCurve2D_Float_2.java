import java.awt.geom.QuadCurve2D;

public class QuadCurve2D_Float_2 {
    public static void main(String[] args) {
        QuadCurve2D.Float curve = new QuadCurve2D.Float(0.0f, 0.0f, 50.0f, 50.0f, 100.0f, 0.0f);
        double startY = curve.getY1();
        System.out.println("Start Y coordinate: " + startY);
    }
}
