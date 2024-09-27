import java.awt.geom.QuadCurve2D;

public class QuadCurve2D_20 {
    public static void main(String[] args) {
        QuadCurve2D quadCurve = new QuadCurve2D.Double(0, 0, 10, 10, 20, 20);
        boolean intersects = quadCurve.intersects(5, 5, 10, 10);
        System.out.println(intersects);
    }
}
