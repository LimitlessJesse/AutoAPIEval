import java.awt.geom.AffineTransform;
import java.awt.geom.Path2D;
import java.awt.geom.PathIterator;

public class Path2D_20 {
    public static void main(String[] args) {
        Path2D path = new Path2D.Double();
        path.moveTo(10, 10);
        path.lineTo(20, 20);
        path.curveTo(30, 30, 40, 40, 50, 50);

        AffineTransform at = new AffineTransform();
        at.scale(2, 2);

        double flatness = 0.1;

        PathIterator pi = path.getPathIterator(at, flatness);

        while (!pi.isDone()) {
            int type = pi.currentSegment(null);
            System.out.println("Segment type: " + type);
            pi.next();
        }
    }
}
