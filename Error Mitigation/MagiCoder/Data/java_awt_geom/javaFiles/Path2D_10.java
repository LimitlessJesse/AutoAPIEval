import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;

public class Path2D_10 {
    public static void main(String[] args) {
        Path2D path = new Path2D.Double();
        path.moveTo(10, 10);
        path.lineTo(100, 100);
        path.closePath();

        Rectangle2D rect = new Rectangle2D.Double(50, 50, 100, 100);

        boolean intersects = path.intersects(rect);
        System.out.println("Does the path intersect the rectangle? " + intersects);
    }
}
