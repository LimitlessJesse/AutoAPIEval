import java.awt.geom.Path2D;
import java.awt.geom.Point2D;

public class Path2D_6 {
    public static void main(String[] args) {
        Path2D path = new Path2D.Double();
        path.moveTo(0, 0);
        path.lineTo(10, 10);
        path.lineTo(0, 10);
        path.closePath();

        Point2D point = new Point2D.Double(5, 5);
        boolean isInside = path.contains(point);

        System.out.println("Point is inside the path: " + isInside);
    }
}
