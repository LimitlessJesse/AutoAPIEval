import java.awt.geom.QuadCurve2D;

public class QuadCurve2D_13 {
    public static void main(String[] args) {
        QuadCurve2D quadCurve = new QuadCurve2D.Double(0, 0, 10, 10, 20, 0);
        boolean isInside = quadCurve.contains(10, 5);
        System.out.println(isInside);
    }
}
