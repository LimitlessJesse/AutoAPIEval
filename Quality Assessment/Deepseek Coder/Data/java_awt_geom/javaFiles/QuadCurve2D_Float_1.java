import java.awt.geom.QuadCurve2D;

public class QuadCurve2D_Float_1 {
    public static void main(String[] args) {
        QuadCurve2D.Float quadCurve = new QuadCurve2D.Float();
        quadCurve.setCurve(10, 20, 30, 40, 50, 60);
        System.out.println("QuadCurve2D: " + quadCurve);
    }
}
