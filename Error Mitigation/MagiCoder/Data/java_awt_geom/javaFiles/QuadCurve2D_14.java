import java.awt.geom.Point2D;
import java.awt.geom.QuadCurve2D;

public class QuadCurve2D_14 {
    public static void main(String[] args) {
        QuadCurve2D quadCurve = new QuadCurve2D.Double(0, 0, 10, 10, 20, 0);
        Point2D point = new Point2D.Double(10, 5);
        boolean isInside = quadCurve.contains(point);
        System.out.println("Is the point inside the quad curve? " + isInside);
    }
}
